package com.meng.www.pojo;

import lombok.Data;

/**
 * @program: ssm
 * @description: 用户实体类
 * @author: MengW9
 * @create: 2019-10-15 20:35
 **/
@Data
public class User {
    /**
     * 编号
     */
    private Long id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;
}
