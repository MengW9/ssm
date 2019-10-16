package com.meng.www.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: ssm
 * @description: 全局异常处理器
 * @author: MengW9
 * @create: 2019-10-15 20:48
 **/
public class CustomExceptionResolver implements HandlerExceptionResolver {

    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        //handler就是处理器适配器要执行的处理器(只有methor方法)

        //1.解析出异常类型
        CustomException exception = null;
        //如果该异常类型是系统自定义的异常，直接去除异常信息，在错误页面展示
        if(e instanceof CustomException){
            exception = (CustomException) e;
        }else {
            //如果该异常类型不是系统自定义的异常，构造一个自定义的异常类型（信息为“未知错误”）
            exception = new CustomException("未知错误，请联系管理员");
        }

        ModelAndView modelAndView = new ModelAndView();

        //将错误信息传到页面
        modelAndView.addObject("message",exception.getMessage());

        //指定错误页面
        modelAndView.setViewName("error");

        return modelAndView;
    }
}
