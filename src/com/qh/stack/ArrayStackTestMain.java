package com.qh.stack;

import org.junit.Test;

import java.util.Stack;

/**
 * @ProjectName data-construction
 * @ClassName ArrayStackTestMain
 * @Description TODO
 * @Author mi
 * @Date 2020/6/3 15:00
 * @Version 1.0
 **/
public class ArrayStackTestMain {

    @Test
    public void test1() {
        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        for (int i = 0; i < 4; i++) {
            arrayStack.push(i);
        }
        System.out.println(arrayStack.peek());
        System.out.println(arrayStack);
    }


    @Test
    public void  test2(){
        String s="{}{{";
        Stack stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c=='{'){
                stack.push(c);
            }else {
                Object pop = stack.pop();
                if(c=='}'&&pop.toString().equals("}")){
                    System.out.println("f");
                }
            }
        }
        if(stack.empty()){
            System.out.println("t");
        }else {
            System.out.println("f");
        }
    }

}
