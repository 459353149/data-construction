package com.qh.setandmap;

import org.junit.Test;

/**
 * @ProjectName data-construction
 * @ClassName TestMain
 * @Description TODO
 * @Author mi
 * @Date 2020/6/19 16:01
 * @Version 1.0
 **/
public class TestMain {

    @Test
    public  void test01() {
        BSTSet<Integer> bstSet = new BSTSet<>();
        for (int i = 0; i < 10; i++) {
            bstSet.add(i);
        }
        System.out.println(bstSet.getSize());
    }

    @Test
    public  void test02() {
        LinkedSet<Integer> bstSet = new LinkedSet<>();
        for (int i = 0; i < 10; i++) {
            bstSet.add(i);
        }

        System.out.println(bstSet.getSize());
        bstSet.remove(6);
        System.out.println(bstSet.getSize());
        System.out.println(bstSet);
    }

}
