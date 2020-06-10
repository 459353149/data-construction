package com.qh.setandmap;

/**
 * @ProjectName data-construction
 * @ClassName Set
 * @Description TODO
 * @Author mi
 * @Date 2020/6/10 14:19
 * @Version 1.0
 **/
public interface Set<E> {

    /**
     * 添加
     * @param e
     */
    void add(E e);

    /**
     * 删除
     * @param e
     */
    void remove(E e);

    /**
     * 是否包含
     * @param e
     * @return
     */
    boolean contains(E e);

    /**
     * 获取大小
     * @return
     */
    Integer getSize();

    /**
     * 是否为空
     * @return
     */
    boolean empty();
}
