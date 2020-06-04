package com.qh.recursion;

/**
 * @ProjectName data-construction
 * @ClassName Sum
 * @Description TODO
 * @Author mi
 * @Date 2020/6/4 14:00
 * @Version 1.0
 **/
public class Sum {

    public static int sum(int[] arr) {
        return sum(arr, 0);
    }

    private static int sum(int[] arr, int l) {
        if (l == arr.length) {
            return 0;
        }
        return arr[l] + sum(arr, l + 1);
    }
}
