package com.qh.stack;

import com.qh.array.Array;

/**
 * @ProjectName data-construction
 * @ClassName ArrayStack
 * @Description TODO
 * @Author mi
 * @Date 2020/6/1 17:10
 * @Version 1.0
 **/
public class ArrayStack<E> implements Stack<E> {

    Array<E> array;


    public ArrayStack(int capacity) {
        array = new Array<>(capacity);
    }


    public ArrayStack() {
        array = new Array<>();
    }


    @Override
    public void push(E e) {
        array.addFirst(e);
    }

    @Override
    public E pop() {
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.getLast();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }


    public int getCapaticy() {
        return array.getCapacity();
    }

    @Override
    public String toString() {
        return "ArrayStack{" +
                "array=" + array +
                '}';
    }
}
