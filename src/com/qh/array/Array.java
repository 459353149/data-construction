package com.qh.array;

/**
 * @ProjectName data-construction
 * @ClassName Array
 * @Description TODO 数据结构 数组
 * @Author mi
 * @Date 2020/6/1 15:08
 * @Version 1.0
 **/
public class Array<T> {


    private T[] data;

    /**
     * 描述大小
     */
    private int size;

    /**
     * 构造函数 传入数组的容量 构造Array
     *
     * @param capacity
     */
    public Array(int capacity) {
        data = (T[]) new Object[capacity];
        size = 0;
    }

    /**
     * 默认为10
     */
    public Array() {
        this(10);
    }


    /**
     * 获得数组中元素个数
     *
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * 获得数组大小
     *
     * @return
     */
    public int getCapacity() {
        return data.length;
    }

    /**
     * 数组是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 在数组最后添加元素
     *
     * @param e
     */
    public void addLast(T e) {
        add(size, e);
    }

    /**
     * 添加指定位置元素
     *
     * @param index
     * @param e
     */
    public void add(int index, T e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("addLast failed");
        }

        if (size == data.length) {
            // 进行扩容
            resize(2 * data.length);
        }

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        this.size++;
    }

    /**
     * 扩容
     *
     * @param i
     */
    private void resize(int i) {
        T[] newDate = (T[]) new Object[i];
        for (int i1 = 0; i1 < newDate.length; i1++) {
            newDate[i1] = data[i1];
        }
        data = newDate;
    }

    /**
     * 向元素首位添加元素
     *
     * @param e
     */
    public void addFirst(T e) {
        add(0, e);
    }


    /**
     * 根据下标获取元素
     *
     * @param index
     * @return
     */
    public T get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("addLast failed");
        }
        return data[index];
    }

    /**
     * 根据下标修改元素
     *
     * @param index
     * @param e
     */
    public void set(int index, T e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("addLast failed");
        }
        data[index] = e;
    }

    /**
     * 判断是否包含该元素
     *
     * @param e
     * @return
     */
    public boolean contains(T e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 获取元素下标
     *
     * @param e
     * @return
     */
    public int find(T e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 删除指定位置元素
     *
     * @param index
     * @return
     */
    public T remove(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("addLast failed");
        }
        T res = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        data[size] = null;
        if (size == data.length / 2) {
            // 扩容
            resize(data.length / 2);
        }
        return res;
    }

    /**
     * 删除最后一个元素
     *
     * @return
     */
    public T removeLast() {
        return remove(size - 1);
    }

    /**
     * 删除第一个元素
     *
     * @return
     */
    public T removeFirst() {
        return remove(0);
    }


    /**
     * 删除指定元素
     *
     * @param e
     */
    public void removeElement(T e) {
        int i = find(e);
        if (i != -1) {
            remove(i);
        }
    }


    /**
     * 获得最后一个元素
     *
     * @return
     */
    public T getLast() {
        return get(size - 1);
    }

    /**
     * 获得第一个元素
     *
     * @return
     */
    public T getFirst() {
        return get(0);
    }


    public void swap(int i, int j) {
        if (i < 0 || i > size || j < 0 || j >= size) {
            throw new IllegalArgumentException("下标越界");
        }
        T t = data[i];
        data[i] = data[j];
        data[j] = t;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Array: size = %d , capacity =%d\n", size, data.length));
        stringBuilder.append("[");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(data[i]);
            if (i != size - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
