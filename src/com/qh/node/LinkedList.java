package com.qh.node;

/**
 * @ProjectName data-construction
 * @ClassName LinkedList
 * @Description TODO
 * @Author mi
 * @Date 2020/6/3 17:10
 * @Version 1.0
 **/
public class LinkedList<E> {

    private Node dummyHead;

    private int size;

    public LinkedList() {
        dummyHead = new Node(null, null);
        size = 0;
    }

    public void add(int index, E e) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException("add index is illegal");
        Node prev = dummyHead;
        for (int i = 0; i < index; i++)
            // 找到待插入节点前面一个节点
            prev = prev.node;
        prev.node = new Node(e, prev.node);
        size++;

    }

    public void addFirst(E e) {
        add(0, e);
    }

    public void addLast(E e) {
        add(size, e);
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public E get(int index) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException("add index is illegal");
        Node cur = dummyHead.node;
        for (int i = 0; i < index; i++) {
            cur = dummyHead.node;
        }
        return cur.e;
    }

    public E getFirst() {
        return get(0);
    }

    public E getLast() {
        return get(size);
    }

    public void set(int index, E e) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException("add index is illegal");

        Node cur = dummyHead.node;
        for (int i = 0; i < index; i++) {
            cur = cur.node;
        }
        cur.e = e;
    }

    public E remove(int index) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException("add index is illegal");
        // 找到待删除元素前一个位置
        Node prev = dummyHead;
        for (int i = 0; i < index; i++)
            prev = prev.node;
        Node retNod = prev.node;
        prev.node = retNod.node;
        retNod.node = null;
        size--;
        return retNod.e;
    }

    public E removeFirst() {
        return remove(0);
    }

    public E removeLast() {
        return remove(size - 1);
    }

    public boolean contains(E e) {
        Node cur = dummyHead.node;
        while (cur != null) {
            if (cur.e.equals(e)) {
                return true;
            }
            cur = cur.node;
        }
        return false;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "dummyHead=" + dummyHead +
                ", size=" + size +
                '}';
    }

    private class Node {
        public E e;
        public Node node;

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        public Node(E e, Node node) {
            this.e = e;
            this.node = node;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "e=" + e +
                    ", node=" + node +
                    '}';
        }
    }

}
