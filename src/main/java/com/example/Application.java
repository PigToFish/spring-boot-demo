package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

/**
 * Author:shenqin
 * version: V1.0
 * Date: 2017/6/13
 * Time: 15:15
 * Description:启动项目，必须放在外层包
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication application=new SpringApplication(Application.class);
        Environment environment=application.run(args).getEnvironment();
    }
}
