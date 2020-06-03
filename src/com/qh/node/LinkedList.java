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

    private Node head;

    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }


    public void add(E e) {
        Node node = new Node(e);
        node.node = head;
        node = head;
        size++;
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
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
