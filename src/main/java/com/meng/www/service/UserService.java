package com.meng.www.service;

import com.meng.www.pojo.User;

import java.util.List;

/**
 * @Description： 用户表相关的service接口
 * @Author： MengW9
 * @Date： 2019/10/15
 * @Time： 20:41
 */
public interface UserService {

    /**
     * 获取所有的用户信息
     *
     * @return
     */
    List<User> getAllUsers();

}
