package com.qh.queue;

/**
 * @ProjectName data-construction
 * @ClassName LinkedQueue
 * @Description TODO
 * @Author Administrator
 * @Date 2020/6/3 0003 23:09
 * @Version 1.0
 **/
public class LinkedQueue<E> implements Queue<E> {
    private Node head, tail;
    private int size;

    public LinkedQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void enqueue(E e) {
        // 从链表尾开始
        if (tail == null) {
            tail = new Node(e);
            head = tail;
        } else {
            tail.node = new Node(e);
            tail = tail.node;
        }
        size++;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public E dequeue() {
        if (isEmpty())
            throw new IllegalArgumentException("  queue is empty");
        Node retNode = head;
        head = head.node;
        retNode.node = null;
        if (head == null) {
            tail = null;
        }
        size--;
        return retNode.e;
    }

    @Override
    public E getFront() {
        if (isEmpty())
            throw new IllegalArgumentException("  queue is empty");
        return head.e;
    }

    @Override
    public String toString() {
        return "LinkedQueue{" +
                "head=" + head +
                ", tail=" + tail +
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
