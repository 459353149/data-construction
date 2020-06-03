package com.qh.node;

/**
 * @ProjectName data-construction
 * @ClassName TestMain
 * @Description TODO
 * @Author Administrator
 * @Date 2020/6/3 0003 22:40
 * @Version 1.0
 **/
public class TestMain {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            linkedList.addFirst(i);
        }
        linkedList.add(2,666 );
        System.out.println(linkedList);
        linkedList.remove(2);
        System.out.println(linkedList);
    }



}
