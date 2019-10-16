package com.meng.www.service.impl;

import com.meng.www.mapper.UserMapper;
import com.meng.www.pojo.User;
import com.meng.www.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: ssm
 * @description: 用户表相关的service接口实现类
 * @author: MengW9
 * @create: 2019-10-15 20:42
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserMapper userMapper;

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

}
