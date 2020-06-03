package com.qh.stack;

/**
 * @ProjectName data-construction
 * @ClassName LinkedListStackTestMain
 * @Description TODO
 * @Author Administrator
 * @Date 2020/6/3 0003 23:06
 * @Version 1.0
 **/
public class LinkedListStackTestMain {
    public static void main(String[] args) {
        LinkedListStack<Integer> linkedList = new LinkedListStack<>();
        for (int i = 0; i < 5; i++) {
            linkedList.push(i);
        }
        System.out.println(linkedList);
        linkedList.pop();
        System.out.println(linkedList);
    }
}
