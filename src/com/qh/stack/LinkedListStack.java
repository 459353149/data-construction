package com.qh.stack;

import com.qh.node.LinkedList;

/**
 * @ProjectName data-construction
 * @ClassName LinkedListStack
 * @Description TODO
 * @Author Administrator
 * @Date 2020/6/3 0003 23:03
 * @Version 1.0
 **/
public class LinkedListStack<E> implements Stack<E> {

    private LinkedList<E> list;

    public LinkedListStack() {
        list = new LinkedList<>();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E peek() {
        return list.getFirst();
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "LinkedListStack{" +
                "list=" + list +
                '}';
    }
}
