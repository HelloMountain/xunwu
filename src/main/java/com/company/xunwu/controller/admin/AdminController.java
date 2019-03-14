package com.company.xunwu.controller.admin;

import com.company.xunwu.base.ApiResponse;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import com.company.xunwu.entity.MyPutRet;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.StringMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;

@Controller
public class AdminController {

    @Autowired
    private UploadManager uploadManager;

    @Autowired
    private String upToken;

    @Autowired
    private StringMap putPolicy;

//    Logger logger= LoggerFactory.getLogger(AdminController.class);

    @GetMapping(value = "/admin/center")
    public String centerPage(){
        return "/admin/center";
    }

    @GetMapping(value = "/admin/common")
    public String commonPage(){
        return "/admin/common";
    }

    @GetMapping(value = "/admin/add/house")
    public String addHousePage(){
        return "/admin/house-add";
    }

    @GetMapping(value = "/admin/edit/house")
    public String editHousePage(){
        return "/admin/house-edit";
    }

    @GetMapping(value = "/admin/list/house")
    public String listHousePage(){
        return "/admin/house-list";
    }

    @GetMapping(value = "/admin/welcome")
    public String welcomePage(){
        return "/admin/welcome";
    }

    @GetMapping(value = "/admin/login")
    public String adminLoginPage(){
        return "/admin/login";
    }

    @GetMapping(value = "/admin/subscribe")
    public String subscribePage(){
        return "/admin/subscribe";
    }

    @PostMapping(value = "/admin/upload/photo", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @ResponseBody
    public ApiResponse imageUpload(@RequestParam MultipartFile file, HttpServletRequest request){
//            logger.info("学生头像上传....");
            //获取文件名
//            String originalFilename = file.getOriginalFilename();
//            logger.info("上传文件名：" + originalFilename);
//            String realPath = request.getServletContext().getRealPath("/public/student/");
//        System.out.println(originalFilename);
//            String realPath = "D:\\xunwu\\temp\\"+originalFilename;
//        System.out.println(request.getServletContext().getRealPath("/public/student/"));
//            String uploadFileName = System.currentTimeMillis()+"_"+ originalFilename;
//
//            File target = new File(realPath);
//        try {
//            file.transferTo(target);
//        } catch (IOException e) {
//            e.printStackTrace();
        try {
            MyPutRet myPutRet = uploadQNImg(file.getInputStream(), null);
            return new ApiResponse().ofSuccess(myPutRet);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ApiResponse().ofStatus(ApiResponse.Status.BAD_REQUEST);
    }

    private MyPutRet uploadQNImg(InputStream inputStream, String key){
        try {
//            Response response = uploadManager.put(file, key, upToken, putPolicy, null);
            Response response = uploadManager.put(inputStream, null, upToken, putPolicy, null);
            MyPutRet myPutRet = response.jsonToObject(MyPutRet.class);
            return myPutRet;
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
        return null;
    }
}
