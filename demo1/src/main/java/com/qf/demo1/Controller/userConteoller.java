package com.qf.demo1.Controller;

import com.qf.demo1.entity.User;
import com.qf.demo1.entity.resources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import com.qf.demo1.entity.resources;
/**
 * @author biubiu
 * @Data 2019/7/29
 */
@RestController
@RequestMapping("user")
public class userConteoller {
@Autowired
private resources resources;
    @GetMapping("demo1")
    public User demo1(User user) {
        return user;
    }
    @GetMapping("demo2")
    public String demo2(){
        System.out.println(resources.getEmialServer()+"     "+resources.getImageServer());
        return "";
    }
}
