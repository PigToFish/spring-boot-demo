package com.example.controller;

import com.example.logic.IStudentLogic;
import com.example.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author:shenqin
 * version: V1.0
 * Date: 2017/6/13
 * Time: 15:26
 * Description:测试
 */

@RestController
@Transactional
public class CommonActionCtrl {

    @Autowired
    private IStudentLogic studentLogic;

    //http://127.0.0.1:8080/test
    @RequestMapping("test")
    public void test(HttpServletResponse response){
        try {
            System.out.println("aaaaaa222");
            Student student=studentLogic.getByNumber(1029);
            System.out.println(student.toString());
            response.setContentType("application/json");
            response.setHeader("Cache-Control", "no-cache");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write("{\"msg\":\"HELLO WORLD 2a\"}");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
