package com.company.xunwu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@MapperScan(basePackages = "com.company.xunwu.dao")
public class XunwuApplication{

    public static void main(String[] args) {
        SpringApplication.run(XunwuApplication.class, args);
    }
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("doc.html").addResourceLocations("classpath*:/META-INF/resources/");
//        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath*:/META-INF/resources/webjars/");
//    }
}
