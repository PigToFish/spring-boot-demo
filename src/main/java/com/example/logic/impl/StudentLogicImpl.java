package com.example.logic.impl;

import com.example.dao.IStudentDao;
import com.example.logic.IStudentLogic;
import com.example.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author:shenqin
 * version: V1.0
 * Date: 2017/8/3
 * Time: 14:08
 * Description:
 */
@Service
public class StudentLogicImpl implements  IStudentLogic{

    @Autowired
    private IStudentDao studentDao;


    @Override
    public Student getByNumber(Integer number) {
        return studentDao.getByNumber(number);
    }

}
