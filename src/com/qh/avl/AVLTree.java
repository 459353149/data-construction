package com.qh.avl;

/**
 * @ProjectName data-construction
 * @ClassName AVLTree
 * @Description TODO
 * @Author mi
 * @Date 2020/7/8 14:44
 * @Version 1.0
 **/
public class AVLTree<K extends Comparable<K>, V> {

    private Node root;
    private int size;

    public void add(K k, V v) {
        add(root, k, v);
    }

    public V remove(K k) {
        return remove(root, k).value;
    }

    public boolean contains(K k) {
        return getNode(root, k) != null;
    }

    public V get(K k) {
        Node node = getNode(root, k);
        return node == null ? null : node.value;
    }

    public void set(K k, V v) {
        Node node = getNode(root, k);
        if (node == null) {
            throw new IllegalArgumentException(k + " 不存在");
        }
        node.value = v;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    private class Node {
        public K key;
        public V value;
        public Node left, right;

        public int height;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.left = null;
            this.right = null;
            height = 1;
        }
    }


    private int getBalanceFactor(Node node) {
        if (node == null) {
            return 0;
        }
        return getHeigth(node.left) - getHeigth(node.right);
    }

    private Node add(Node node, K key, V value) {
        // 终止条件
        if (null == node) {
            size++;
            return new Node(key, value);
        }
        // 递归调用
        if (key.compareTo(node.key) < 0) {
            node.left = add(node.left, key, value);
        } else if (key.compareTo(node.key) > 0) {
            node.right = add(node.right, key, value);
        } else {
            node.value = value;
        }
        // 更新height
        node.height = 1 + Math.max(getHeigth(node.left), getHeigth(node.right));
        int balanceFactor = getBalanceFactor(node);
        return node;
    }

    private Node remove(Node root, K key) {
        if (null == root) {
            return null;
        }
        if (key.compareTo(root.key) < 0) {
            root.left = remove(root.left, key);
            return root;
        }
        if (key.compareTo(root.key) > 0) {
            root.right = remove(root.right, key);
            return root;
        }
        if (null == root.left) {
            // 判断当前节点是否有右节点
            Node rightNode = root.right;
            root.right = null;
            size--;
            return rightNode;
        }
        if (null == root.right) {
            // 判断当前节点是否有右节点
            Node leftNode = root.left;
            root.left = null;
            size--;
            return leftNode;
        }
        // 待删除节点存在左右节点时，找到右节点最小节点
        Node successor = maxE(root.right);
        successor.right = removeMax(root.right);
        successor.left = root.left;
        root.left = root.right = null;
        return successor;
    }

    private Node removeMax(Node root) {
        // 递归结束条件
        if (null == root.right) {
            // 判断当前节点是否有右节点
            Node leftNode = root.left;
            root.left = null;
            size--;
            return leftNode;
        }
        root.right = removeMin(root.right);
        return root;
    }

    private Node removeMin(Node root) {
        // 递归结束条件
        if (null == root.left) {
            // 判断当前节点是否有右节点
            Node rightNode = root.right;
            root.right = null;
            size--;
            return rightNode;
        }
        root.left = removeMin(root.left);
        return root;
    }

    /**
     * 递归寻找
     *
     * @param root
     * @return
     */
    private Node maxE(Node root) {
        if (null == root.right) {
            return root;
        }
        return maxE(root.right);
    }


    /**
     * 递归寻找node
     *
     * @param node
     * @param key
     * @return
     */
    private Node getNode(Node node, K key) {
        if (node == null) {
            return null;
        }
        if (key.compareTo(node.key) == 0) {
            return node;
        }
        if (key.compareTo(node.key) < 0) {
            return getNode(node.left, key);
        }
        return getNode(node.right, key);
    }


    public int getHeigth(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }
}
