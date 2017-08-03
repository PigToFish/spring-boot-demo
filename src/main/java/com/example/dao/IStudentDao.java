package com.example.dao;

import com.example.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Author:shenqin
 * version: V1.0
 * Date: 2017/8/3
 * Time: 14:03
 * Description:
 */
@Mapper
public interface IStudentDao {

    Student getByNumber( @Param("number")Integer number);

}
