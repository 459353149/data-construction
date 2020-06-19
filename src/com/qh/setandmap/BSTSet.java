package com.qh.setandmap;

import com.qh.binarytree.BST;

/**
 * @ProjectName data-construction
 * @ClassName BSTSet
 * @Description TODO
 * @Author mi
 * @Date 2020/6/10 14:20
 * @Version 1.0
 **/
public class BSTSet<E extends Comparable<E>> implements Set<E> {
    private BST<E> bst;

    public BSTSet() {
        bst = new BST<>();
    }

    @Override
    public void add(E e) {
        bst.add(e);
    }

    @Override
    public void remove(E e) {
        bst.remove(e);
    }

    @Override
    public boolean contains(E e) {
        return bst.contains(e);
    }

    @Override
    public Integer getSize() {
        return bst.getSize();
    }

    @Override
    public boolean empty() {
        return bst.isEmpty();
    }
}
