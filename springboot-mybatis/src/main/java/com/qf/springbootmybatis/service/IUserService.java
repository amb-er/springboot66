package com.qf.springbootmybatis.service;

import com.qf.springbootmybatis.entity.TUser;

import java.util.List;

/**
 * @author biubiu
 * @Data 2019/7/29
 */
public interface IUserService {
    TUser getUserList(Integer id);

    List<TUser> getUser();
}
