package com.qh.setandmap;

/**
 * @ProjectName data-construction
 * @ClassName Map
 * @Description TODO
 * @Author mi
 * @Date 2020/6/19 16:52
 * @Version 1.0
 **/
public interface Map<K, V> {

    /**
     * 添加元素
     *
     * @param k
     * @param v
     */
    void add(K k, V v);

    /**
     * 删除指定k的元素
     *
     * @param k
     * @return
     */
    V remove(K k);

    /**
     * 是否包含该K
     * @param k
     * @return
     */
    boolean contains(K k);

    /**
     * 根据K获取指定元素
     * @param k
     * @return
     */
    V get(K k);

    /**
     * 修改
     * @param k
     * @param v
     */
    void set(K k,V v);

    /**
     * 获得大小
     * @return
     */
    int getSize();

    /**
     * 是否为空
     * @return
     */
    boolean isEmpty();


}
