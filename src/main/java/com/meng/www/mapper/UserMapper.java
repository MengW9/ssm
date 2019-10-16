package com.meng.www.mapper;

import com.meng.www.pojo.User;

import java.util.List;

/**
 * @program: ssm
 * @description: 用户表实体mapper接口类
 * @author: MengW9
 * @create: 2019-10-15 20:38
 **/
public interface UserMapper {

    /**
     * 查找所有的用户信息
     * @return
     */
    List<User> getAllUsers();

}
