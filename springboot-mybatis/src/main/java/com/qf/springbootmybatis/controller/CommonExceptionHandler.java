package com.qf.springbootmybatis.controller;

import com.qf.springbootmybatis.entity.ResultBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author biubiu
 * @Data 2019/7/30
 */
@ControllerAdvice
public class CommonExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String biu(Exception e){
        return "<script>alert(\"服务器开小差啦！\");location.href=\"/index.html\";</script>";
}
}
