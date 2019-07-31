package com.qf.springbootmybatis.service.impl;

import com.qf.springbootmybatis.entity.TUser;
import com.qf.springbootmybatis.mapper.TUserMapper;
import com.qf.springbootmybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author biubiu
 * @Data 2019/7/29
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private TUserMapper userMapper;
    @Override
    public TUser getUserList(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TUser> getUser() {
        return userMapper.getUser();
    }
}
