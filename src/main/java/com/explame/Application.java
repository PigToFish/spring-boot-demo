package com.explame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

/**
 * Author:shenqin
 * version: V1.0
 * Date: 2017/6/13
 * Time: 15:15
 * Description:
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication application=new SpringApplication(Application.class);
        Environment environment=application.run(args).getEnvironment();
    }
}
