package com.qh.stack;

/**
 * @ProjectName data-construction
 * @ClassName Stack 栈
 * @Description TODO
 * @Author mi
 * @Date 2020/6/1 17:08
 * @Version 1.0
 **/
public interface Stack<E> {
    void push(E e);

    E pop();

    E peek();

    int getSize();

    boolean isEmpty();


}
