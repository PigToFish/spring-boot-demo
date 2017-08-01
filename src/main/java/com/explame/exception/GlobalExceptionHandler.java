package com.explame.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * Author:shenqin
 * version: V1.0
 * Date: 2017/8/1
 * Time: 13:48
 * Description:全局异常,返回一个统一的类会页面
 */
@ControllerAdvice
public class GlobalExceptionHandler {



//    @ExceptionHandler(RuntimeException.class)
//    @ResponseBody //在返回自定义相应类的情况下必须有，这是@ControllerAdvice注解的规定
    @ExceptionHandler
    public String exceptionHandler(RuntimeException e, HttpServletResponse response) {
        System.out.println("---------exception-------");
        return "exception";
    }
}
