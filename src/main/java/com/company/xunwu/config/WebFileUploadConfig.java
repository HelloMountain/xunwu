package com.company.xunwu.config;

import com.qiniu.common.Zone;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import com.qiniu.util.StringMap;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebFileUploadConfig {

    @Value("${qiniu.accessKey}")
    private String accessKey;

    @Value("${qiniu.secretKey}")
    private String secretKey;

    @Value("${qiniu.bucket}")
    private String bucket;

    @Value("${qiniu.path}")
    private String path;

    /*
     * 华东机房
     * */
    @Bean
    public com.qiniu.storage.Configuration qiniuConfig2() {
        return new com.qiniu.storage.Configuration(Zone.zone0());
    }

    /*
     * 七牛云上传工具实例
     * */
    @Bean
    public UploadManager uploadManager() {
        return new UploadManager(qiniuConfig2());
    }

    @Bean
    public Auth auth() {
        return Auth.create(accessKey, secretKey);
    }

    @Bean
    public StringMap putPolicy(){
        StringMap putPolicy = new StringMap();
//        putPolicy.put("callbackUrl", "http://api.example.com/qiniu/upload/callback");
//        putPolicy.put("callbackBody", "{\"key\":\"$(key)\",\"hash\":\"$(etag)\",\"bucket\":\"$(bucket)\",\"fsize\":$(fsize)}");
        putPolicy.put("returnBody", "{\"key\":\"$(key)\",\"hash\":\"$(etag)\",\"bucket\":\"$(bucket)\",\"fsize\":$(fsize)}");

        putPolicy.put("callbackBodyType", "application/json");
        return putPolicy;
    }
    @Bean
    public String upToken() {
        long expireSeconds = 3600;
        return auth().uploadToken(bucket, null, expireSeconds, putPolicy());
    }
}
