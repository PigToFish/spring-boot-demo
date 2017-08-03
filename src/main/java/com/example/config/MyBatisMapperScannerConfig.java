package com.example.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * Author:shenqin
 * version: V1.0
 * Date: 2017/8/3
 * Time: 14:57
 * Description:扫描mybatis的接口
 */
@Configuration
@AutoConfigureAfter(MyBatisConfig.class)
public class MyBatisMapperScannerConfig implements EnvironmentAware {

    @Autowired
    private Environment environment;

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        //获取之前注入的beanName为sqlSessionFactory的对象
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage(environment.getProperty("mybatis.typeAliasesPackage"));
        return mapperScannerConfigurer;
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
