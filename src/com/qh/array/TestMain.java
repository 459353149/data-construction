package com.qh.array;

import org.junit.Test;

/**
 * @ProjectName data-construction
 * @ClassName TestMain
 * @Description TODO
 * @Author mi
 * @Date 2020/6/1 15:19
 * @Version 1.0
 **/
public class TestMain {


    @Test
    public void testAdd(){
        Array<String> array = new Array();
        for (int i = 0; i < 20; i++) {
            array.addLast(i+"");
        }
        System.out.println(array);
        array.add(1, "100");
        System.out.println(array);
        array.addFirst("-1");
        System.out.println(array);


        array.remove(2);
        System.out.println(array);
        array.removeElement("4");
        System.out.println(array);
    }


    @Test
    public void testAddStu(){
        Array<Student> studentArray = new Array();
        studentArray.addFirst(new Student("zhangsan",1));
        studentArray.addFirst(new Student("lisi",2));
        studentArray.addFirst(new Student("wangwu",3));
        System.out.println(studentArray);
    }
}
