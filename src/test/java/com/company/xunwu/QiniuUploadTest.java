package com.company.xunwu;

import com.company.xunwu.config.WebFileUploadConfig;
import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class QiniuUploadTest extends XunwuApplicationTests{

    @Value("${qiniu.accessKey}")
    private String accessKey;

    @Value("${qiniu.secretKey}")
    private String secretKey;

    @Value("${qiniu.bucket}")
    private String bucket;

    @Value("${qiniu.path}")
    private String path;

    @Autowired
    private UploadManager uploadManager;

    @Autowired
    private String upToken;

    @Test
    public void readYml(){
        System.out.println(accessKey);
        System.out.println(secretKey);
        System.out.println(bucket);
        System.out.println(path);
    }
    @Test
    public void uploadImg(){
        String localFilePath = "D:\\xunwu\\temp\\1.jpg";
        String key = null;
        try {
            Response response = uploadManager.put(localFilePath, key, upToken);
            //解析上传成功的结果
            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            System.out.println(upToken);
        } catch (QiniuException e) {
            e.printStackTrace();
            Response r = e.response;
            System.err.println(r.toString());
            try {
                System.err.println(r.bodyString());
            } catch (QiniuException ex2) {
                //ignore
            }
        }

    }
}
