package com.qh.unionfind;

/**
 * @ProjectName data-construction
 * @ClassName UnionFindTwo
 * @Description TODO
 * @Author mi
 * @Date 2020/7/8 14:25
 * @Version 1.0
 **/
public class UnionFindTwo implements UF {

    private int[] parent;

    public UnionFindTwo(int size) {
        parent = new int[size];
        for (int i = 0; i < size; i++) {
            parent[i] = i;
        }
    }

    @Override
    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    @Override
    public int getSize() {
        return parent.length;
    }

    @Override
    public void unionElements(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot == qRoot) {
            return;
        }
        parent[pRoot] = qRoot;
    }

    private int find(int p) {
        if (p < 0 || p >= parent.length) {
            throw new IllegalArgumentException("下标越界");
        }
        while (p != parent[p]) {
            p = parent[p];
        }
        return p;
    }
}
