package com.qh.binarytree;

/**
 * @ProjectName data-construction
 * @ClassName BST
 * @Description TODO  二分搜索树
 * @Author mi
 * @Date 2020/6/4 14:47
 * @Version 1.0
 **/
public class BST<E extends Comparable<E>> {

    private Node root;
    private int size;

    /**
     * 获取大小
     *
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * 是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }


    public void add(E e) {
        root = add(root, e);
    }

    /**
     * 向node为根的二分搜索树中插入元素
     * 返回一个node
     *
     * @param node
     * @param e
     * @return
     */
    private Node add(Node node, E e) {
        // 终止条件
        if (null == node) {
            size++;
            return new Node(e);
        }
        // 递归调用
        if (e.compareTo(node.e) < 0) {
            node.left = add(node.left, e);
        } else if (e.compareTo(node.e) > 0) {
            node.right = add(node.right, e);
        }
        return node;
    }


    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node root) {
        if (null == root) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.e);
        inOrder(root.right);
    }


    /**
     * 查询是否包含元素
     *
     * @param e
     * @return
     */
    public boolean contains(E e) {
        return contains(root, e);
    }

    private boolean contains(Node node, E e) {
        // 终止条件
        if (null == node) {
            return false;
        }
        // 递归调用
        if (e.compareTo(node.e) == 0) {
            return true;
        } else if (e.compareTo(node.e) < 0) {
            return contains(node.left, e);
        } else {
            return contains(node.right, e);
        }
    }

    /**
     * 二分搜索树前序遍历
     */
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        // 递归终止条件
        if (null == node) {
            return;
        }
        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }


    public BST() {
        root = null;
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        bstString(root, 0, stringBuilder);
        return stringBuilder.toString();
    }

    private void bstString(Node root, int i, StringBuilder stringBuilder) {
        if (null == root) {
            stringBuilder.append(i(i) + "null\n");
            return;
        }
        stringBuilder.append(i(i) + root.e + "\n");
        bstString(root.left, i + 1, stringBuilder);
        bstString(root.right, i + 1, stringBuilder);
    }

    private String i(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i1 = 0; i1 < i; i1++) {
            stringBuilder.append("--");
        }
        return stringBuilder.toString();
    }

    private class Node {
        public E e;
        public Node left, right;

        public Node(E e) {
            this.e = e;
            this.left = null;
            this.right = null;
        }
    }


    /**
     * 寻找二分搜索树最小元素
     *
     * @return
     */
    public E minE() {
        if (size == 0) {
            throw new IllegalArgumentException("is null");
        }
        return minE(root).e;
    }

    /**
     * 递归寻找
     *
     * @param root
     * @return
     */
    private Node minE(Node root) {
        if (null == root.left) {
            return root;
        }
        return minE(root.left);
    }

    /**
     * 查询最大元素
     *
     * @return
     */
    public E maxE() {
        if (0 == size) {
            throw new IllegalArgumentException(" is null");
        }
        return maxE(root).e;
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
     * 删除最小值 并返回最小值
     *
     * @return
     */
    public E removeMin() {
        E e = minE();
        root = removeMin(root);
        return e;
    }

    /**
     * 递归删除node节点下最小节点
     * 返回新得二分搜索书得根
     *
     * @param root
     */
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
     * 删除最da值 并返回最大值
     *
     * @return
     */
    public E removeMax() {
        E e = maxE();
        root = removeMax(root);
        return e;
    }

    /**
     * 递归删除node节点下最小节点
     * 返回新得二分搜索书得根
     *
     * @param root
     */
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

    /**
     * 删除指定元素
     *
     * @param e
     */
    public void remove(E e) {
        root = remove(root, e);
    }

    /**
     * 删除指定元素
     *
     * @param root
     * @param e
     * @return
     */
    private Node remove(Node root, E e) {
        if (null == root) {
            return null;
        }
        if (e.compareTo(root.e) < 0) {
            root.left = remove(root.left, e);
            return root;
        }
        if (e.compareTo(root.e) > 0) {
            root.right = remove(root.right, e);
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


}
