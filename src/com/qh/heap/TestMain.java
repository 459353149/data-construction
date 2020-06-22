package com.qh.heap;

import org.junit.Test;

import java.util.Random;

/**
 * @ProjectName data-construction
 * @ClassName TestMain
 * @Description TODO
 * @Author mi
 * @Date 2020/6/22 17:24
 * @Version 1.0
 **/
public class TestMain {

    @Test
    public void test01(){
        MaxHeap<Integer> maxHeap = new MaxHeap<>();

        int n=10;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            maxHeap.add(i);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(maxHeap.extractMax());
        }

    }
}
