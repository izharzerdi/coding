package com.algo.neetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayContainsDup {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3};
        boolean contains = containsDuplicate(arr);
        printResult(contains);
        boolean contains1 = hasDuplicate(arr);
        printResult(contains1);
        boolean contains2 = hasDuplicate1(arr);
        printResult(contains2);
        boolean contains3 = hasDuplicate2(arr);
        printResult(contains3);
    }

    private static boolean hasDuplicate2(int[] arr) {
        return Arrays.stream(arr).distinct().count()< arr.length;
    }

    private static boolean hasDuplicate1(int[] arr) {
        Set<Integer> integerSet = new HashSet<>();
        for (int num : arr) {
            if (integerSet.contains(num)) {
                return true;
            }
            integerSet.add(num);
        }
        return false;
    }

    private static boolean hasDuplicate(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return true;
            }
        }
        return false;
    }

    private static void printResult(boolean contains) {
        if (contains)
            System.out.println("Contains Duplicate");
        else
            System.out.println("Does not contain duplicate");
    }

    private static boolean containsDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
