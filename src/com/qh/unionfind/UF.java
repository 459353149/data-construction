package com.qh.unionfind;

/**
 * @ProjectName data-construction
 * @ClassName UF
 * @Description TODO
 * @Author mi
 * @Date 2020/7/8 14:06
 * @Version 1.0
 **/
public interface UF {
    /**
     * 两个元素是否相连
     *
     * @param p
     * @param q
     * @return
     */
    boolean isConnected(int p, int q);

    int getSize();

    /**
     * 连接两个元素
     *
     * @param p
     * @param q
     */
    void unionElements(int p, int q);
}
