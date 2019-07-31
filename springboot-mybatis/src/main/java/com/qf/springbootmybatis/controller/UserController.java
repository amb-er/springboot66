package com.qf.springbootmybatis.controller;

import com.qf.springbootmybatis.entity.TUser;
import com.qf.springbootmybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author biubiu
 * @Data 2019/7/29
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("getUser/{id}")
    public TUser getUser(@PathVariable("id") Integer id){
        TUser user=userService.getUserList(id);
        System.out.println(user);
        return user;
    }
    @RequestMapping("getUserList")
    public String getUserList(ModelMap map){
        List<TUser> userList=userService.getUser();
        for (TUser user : userList) {
            user.setData(new Date());
        }
        map.put("userList",userList);
        return "index";
    }
}
