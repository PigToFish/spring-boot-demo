package com.example.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

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

        private static Logger LOG= LoggerFactory.getLogger(GlobalExceptionHandler.class);

//    @ExceptionHandler(RuntimeException.class)
//    @ResponseBody //在返回自定义相应类的情况下必须有，这是@ControllerAdvice注解的规定
    @ExceptionHandler
    public String exceptionHandler(Exception e, HttpServletResponse response) {
        System.out.println("---------exception-------");
        LOG.warn(e.getMessage(),e);
        return "exception";
    }
}
