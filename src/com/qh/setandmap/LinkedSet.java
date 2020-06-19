package com.qh.setandmap;

import com.qh.node.LinkedList;

/**
 * @ProjectName data-construction
 * @ClassName LinkedSet
 * @Description TODO
 * @Author mi
 * @Date 2020/6/19 16:07
 * @Version 1.0
 **/
public class LinkedSet<E> implements Set<E> {

    private LinkedList<E> linkedList;

    public LinkedSet() {
        this.linkedList = new LinkedList<>();
    }

    @Override
    public void add(E e) {
        if (!linkedList.contains(e)) {
            linkedList.addFirst(e);
        }
    }

    @Override
    public void remove(E e) {
        linkedList.removeElement(e);
    }

    @Override
    public boolean contains(E e) {
        return linkedList.contains(e);
    }

    @Override
    public Integer getSize() {
        return linkedList.getSize();
    }

    @Override
    public boolean empty() {
        return linkedList.isEmpty();
    }

    @Override
    public String toString() {
        return "LinkedSet{" +
                "linkedList=" + linkedList +
                '}';
    }
}
