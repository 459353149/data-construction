package com.qh.array;

/**
 * @ProjectName data-construction
 * @ClassName Student
 * @Description TODO
 * @Author mi
 * @Date 2020/6/1 16:21
 * @Version 1.0
 **/
public class Student {

    private String name;

    private Integer id;

    public Student(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
