package com.company.xunwu.util;

import com.company.xunwu.config.QiniuConfig;
import com.qiniu.common.Zone;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.io.FileInputStream;

public class QiniuUtil {

    @Autowired
    private QiniuConfig qiniuConfig;

    private String accessKey;
    private String secretKey;
    private String bucket;
    private String path;

    public static String uploadQNImg(FileInputStream fileInputStream, String key){

        //华东机房
        Configuration configuration = new Configuration(Zone.zone0());
        UploadManager uploadManager = new UploadManager(configuration);
return "";
//        Auth auth = Auth.create(qiniuConfig.getBucket());
    }
}
