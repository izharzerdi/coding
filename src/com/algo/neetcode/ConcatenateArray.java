package com.algo.neetcode;

import java.util.Arrays;

public class ConcatenateArray {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 6};
        int[] arr1 = concatenateArray(arr);
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = concatenateArrayInOnePass(arr);
        System.out.println(Arrays.toString(arr2));
    }

    private static int[] concatenateArrayInOnePass(int[] arr) {
        int n = arr.length;
        int[] arr1 = new int[2 * n];
        for (int i = 0; i < n; i++) {
            arr1[i] = arr1[i + n] = arr[i];
        }
        return arr1;
    }

    private static int[] concatenateArray(int[] arr) {
        int[] arr1 = new int[2 * arr.length];
        int idx = 0;
        for (int i = 0; i < 2; i++) {
            for (int num : arr) {
                arr1[idx++] = num;
            }
        }
        return arr1;
    }
}
