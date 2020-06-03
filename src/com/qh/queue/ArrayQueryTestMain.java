package com.qh.queue;

import org.junit.Test;

/**
 * @ProjectName data-construction
 * @ClassName ArrayQueryTestMain
 * @Description TODO
 * @Author mi
 * @Date 2020/6/3 16:12
 * @Version 1.0
 **/
public class ArrayQueryTestMain {
    @Test
    public  void test1() {
        ArrayQuery<Integer> arrayQuery = new ArrayQuery<>();

        for (int i = 0; i < 10; i++) {
            arrayQuery.enqueue(i);
            if(i/3==2){
                arrayQuery.dequeue();
            }
        }
        System.out.println(arrayQuery);
    }

    @Test
    public  void tes2t() {
        LoopQueue<Integer> arrayQuery = new LoopQueue<>();

        for (int i = 0; i < 10; i++) {
            arrayQuery.enqueue(i);
            if(i/3==2){
                arrayQuery.dequeue();
            }
        }
        System.out.println(arrayQuery);
    }

    @Test
    public  void test3() {
        LinkedQueue<Integer> arrayQuery = new LinkedQueue<>();

        for (int i = 0; i < 10; i++) {
            arrayQuery.enqueue(i);
            if(i/3==2){
                arrayQuery.dequeue();
            }
        }
        System.out.println(arrayQuery);
    }
}
