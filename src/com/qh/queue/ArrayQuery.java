package com.qh.queue;

import com.qh.array.Array;

/**
 * @ProjectName data-construction
 * @ClassName ArrayQuery
 * @Description TODO
 * @Author mi
 * @Date 2020/6/3 15:48
 * @Version 1.0
 **/
public class ArrayQuery<E> implements Queue<E> {

    private Array<E> array;

    public ArrayQuery(int copacity) {
        array = new Array<>(copacity);
    }

    public ArrayQuery() {
        this(10);
    }

    @Override
    public void enqueue(E o) {
        array.addLast(o);
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    @Override
    public E getFront() {
        return array.getFirst();
    }

    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public String toString() {
        return "ArrayQuery{" +
                "array=" + array +
                '}';
    }
}
