package com.qh.queue;

import java.util.Arrays;

/**
 * @ProjectName data-construction
 * @ClassName LoopQueue
 * @Description TODO 循环队列
 * @Author mi
 * @Date 2020/6/3 16:22
 * @Version 1.0
 **/
public class LoopQueue<E> implements Queue<E> {


    private E[] data;
    private int front, tail;
    private int size;

    public LoopQueue(int capacity) {
        data = (E[]) new Object[capacity + 1];
        front = 0;
        tail = 0;
        size = 0;
    }

    public LoopQueue() {
        this(10);
    }

    @Override
    public void enqueue(E e) {
        // 判断队列是否满
        if ((tail + 1) % data.length == front) {
            // 扩容
            resize(getCapacity() * 2);
        }
        // 数组末尾赋值
        data[tail] = e;
        // 指向下一次添加的位置
        tail = (tail + 1) % data.length;
        size++;
    }

    /**
     * 数组扩容
     * @param newCapacity
     */
    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity + 1];
        for (int i = 0; i < size; i++) {
            // 下标为front
            newData[i] = data[(front + i) % data.length];
        }
        data = newData;
        front = 0;
        tail = size;
    }

    @Override
    public boolean isEmpty() {
        return front == tail;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("数组为空");
        }
        E datum = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        if (size == getCapacity() / 4 && getCapacity() / 2 != 0) {
            resize(getCapacity() / 2);
        }
        return datum;
    }

    @Override
    public E getFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("数组为空");
        }
        return data[front];
    }

    public int getCapacity() {
        return data.length - 1;
    }

    @Override
    public String toString() {
        return "LoopQueue{" +
                "data=" + Arrays.toString(data) +
                ", front=" + front +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }
}
