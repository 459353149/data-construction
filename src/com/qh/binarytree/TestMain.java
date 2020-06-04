package com.qh.binarytree;

/**
 * @ProjectName data-construction
 * @ClassName TestMain
 * @Description TODO
 * @Author mi
 * @Date 2020/6/4 15:38
 * @Version 1.0
 **/
public class TestMain {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        int[] nums = {5, 3, 6, 8, 4, 2};
        for (int num : nums) {
            bst.add(num);
        }
        bst.preOrder();
        System.out.println();
        bst.inOrder();
        System.out.println();
        System.out.println(bst);
    }
}
