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

    /**
     * 入队
     * @param e
     */
    void enqueue(E e);

    /**
     * 是否为空
     * @return
     */
    boolean isEmpty();

    /**
     * 获取大小
     * @return
     */
    int getSize();

    /**
     * 出队
     * @return
     */
    E dequeue();

    E getFront();

}
