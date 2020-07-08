package com.qh.unionfind;

/**
 * @ProjectName data-construction
 * @ClassName UnionFindOne
 * @Description TODO
 * @Author mi
 * @Date 2020/7/8 14:11
 * @Version 1.0
 **/
public class UnionFindOne implements UF {

    private int[] id;

    public UnionFindOne(int size) {
        id = new int[size];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }
    }

    @Override
    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    @Override
    public int getSize() {
        return id.length;
    }

    @Override
    public void unionElements(int p, int q) {
        int pId = find(p);
        int qId = find(q);
        if (pId == qId) {
            return;
        }
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pId) {
                id[i] = pId;
            }
        }
    }

    private int find(int p) {
        if (p < 0 || p >= id.length) {
            throw new IllegalArgumentException("下标越界");
        }
        return id[p];
    }
}
