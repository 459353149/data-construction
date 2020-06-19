package com.qh.setandmap;

/**
 * @ProjectName data-construction
 * @ClassName LinkedListMap
 * @Description TODO
 * @Author mi
 * @Date 2020/6/19 17:01
 * @Version 1.0
 **/
public class LinkedListMap<K, V> implements Map<K, V> {


    private Node dummyHead;

    private int size;

    public LinkedListMap() {
        size = 0;
        dummyHead = new Node();

    }

    @Override
    public void add(K k, V v) {
        Node node = getNode(k);
        if (node == null) {
            dummyHead.node = new Node(k, v, dummyHead.node);
            size++;
        } else {
            node.value = v;
        }
    }

    @Override
    public V remove(K k) {
        Node prev = dummyHead;
        while (prev.node != null) {
            if (prev.key.equals(k)) {
                break;
            }
            prev = prev.node;
        }
        if (prev.node != null) {
            Node delNode = prev.node;
            prev.node = delNode.node;
            delNode.node = null;
            size--;
            return delNode.value;
        }
        return null;
    }

    @Override
    public boolean contains(K k) {
        return getNode(k) != null;
    }

    @Override
    public V get(K k) {
        Node node = getNode(k);
        return node == null ? null : node.value;
    }

    @Override
    public void set(K k, V v) {
        Node node = getNode(k);
        if (null == node) {
            throw new IllegalArgumentException(k + " 不存在");
        }
        node.value = v;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private class Node {
        public K key;
        public V value;
        public Node node;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public Node() {
            this(null, null, null);
        }

        public Node(K key) {
            this(key, null, null);
        }

        public Node(K key, V value, Node node) {
            this.key = key;
            this.value = value;
            this.node = node;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    ", node=" + node +
                    '}';
        }
    }

    private Node getNode(K key) {
        Node cur = dummyHead.node;
        while (cur != null) {
            if (cur.key.equals(key)) {
                return cur.node;
            }
            cur = cur.node;
        }
        return null;
    }

    @Override
    public String toString() {
        return "LinkedListMap{" +
                "dummyHead=" + dummyHead +
                ", size=" + size +
                '}';
    }
}
