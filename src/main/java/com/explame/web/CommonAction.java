package com.explame.web;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Author:shenqin
 * version: V1.0
 * Date: 2017/6/13
 * Time: 15:26
 * Description:测试
 */

@RestController
@Transactional
public class CommonAction {

    @Resource
    private SessionFactory sessionFactory;

    //http://127.0.0.1:8080/test
    @RequestMapping("test")
    public void test(HttpServletResponse response){
//        Session session = sessionFactory.getCurrentSession();
//        SQLQuery sqlQuery = session.createSQLQuery("select * from user");
//        List list = sqlQuery.list();
//        System.out.printf(list.size()+"");
        try {
            String[] s=new String[3];
            System.out.println(s[5]);
            System.out.println("aaaaaa222");
            response.setContentType("application/json");
            response.setHeader("Cache-Control", "no-cache");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write("{\"msg\":\"HELLO WORLD 2a\"}");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
