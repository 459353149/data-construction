package com.qh.heap;

import com.qh.array.Array;

/**
 * @ProjectName data-construction
 * @ClassName MaxHeap
 * @Description TODO
 * @Author mi
 * @Date 2020/6/22 16:58
 * @Version 1.0
 **/
public class MaxHeap<E extends Comparable<E>> {


    private Array<E> data;


    public MaxHeap(int capacity) {
        data = new Array<>(capacity);
    }


    public MaxHeap() {
        data = new Array<>();
    }

    /**
     * 获取大小
     *
     * @return
     */
    public int getSize() {
        return data.getSize();
    }

    /**
     * 是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return data.isEmpty();
    }

    /**
     * 返回父节点索引
     *
     * @param index
     * @return
     */
    public int parent(int index) {
        if (index == 0) {
            throw new IllegalArgumentException("index 不能为0");
        }
        return (index - 1) / 2;
    }

    /**
     * 返回左孩子节点索引
     *
     * @param index
     * @return
     */
    private int leftChild(int index) {

        return index * 2 + 1;
    }

    /**
     * 返回右孩子节点索引
     *
     * @param index
     * @return
     */
    private int rightChild(int index) {

        return index * 2 + 2;
    }


    /**
     * 向堆中添加元素
     *
     * @param e
     */
    public void add(E e) {
        data.addLast(e);
        sifUp(data.getSize() - 1);
    }

    /**
     * 上移元素
     *
     * @param index
     */
    private void sifUp(int index) {
        while (index > 0 && data.get(parent(index)).compareTo(data.get(index)) < 0) {
            data.swap(index, parent(index));
            index = parent(index);
        }
    }

    /**
     * 找到最大元素
     *
     * @return
     */
    public E findMax() {
        if (data.getSize() == 0) {
            throw new IllegalArgumentException("data is null");
        }
        return data.get(0);
    }

    /**
     * 取出堆中最大元素
     *
     * @return
     */
    public E extractMax() {
        E ret = findMax();
        // 赋值
        data.swap(0, data.getSize() - 1);
        data.removeLast();
        // 下沉
        siftDown(0);
        return ret;
    }

    /**
     * 下沉
     *
     * @param k
     */
    private void siftDown(int k) {
        while (leftChild(k) < data.getSize()) {
            int j = leftChild(k);
            if (j + 1 < data.getSize() && data.get(j - 1).compareTo(data.get(j)) > 0) {
                // data[j]是leftChild和rightChild的最大值
                j = rightChild(k);
            }
            if (data.get(k).compareTo(data.get(j)) >= 0) {
                break;
            }
            data.swap(k, j);
            k = j;
        }
    }

    /**
     * 替换最大元素
     * @param e
     * @return
     */
    public E replace(E e) {
        E ret = findMax();
        data.set(0, e);
        siftDown(0);
        return ret;
    }




}
