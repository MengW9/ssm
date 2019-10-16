package com.meng.www.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @program: ssm
 * @description:
 * @author: MengW9
 * @create: 2019-10-15 20:52
 **/
@Data
@AllArgsConstructor
public class CustomException extends Exception{

    private String message;

}
