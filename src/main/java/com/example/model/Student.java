package com.example.model;

/**
 * Author:shenqin
 * version: V1.0
 * Date: 2017/8/3
 * Time: 13:54
 * Description:
 */
public class Student {

    private Long id ;

    private Integer number;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
