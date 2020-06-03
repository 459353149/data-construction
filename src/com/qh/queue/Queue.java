package com.qh.queue;

/**
 * @ProjectName data-construction
 * @ClassName Queue
 * @Description TODO
 * @Author mi
 * @Date 2020/6/3 15:46
 * @Version 1.0
 **/
public interface Queue<E> {

    void enqueue(E e);

    boolean isEmpty();

    int getSize();

    E dequeue();

    E getFront();

}
