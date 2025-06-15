package com.algo.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseIntArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 1, 7, 3, 9, 6};
        int[] reverseArr = IntStream.rangeClosed(1, array.length).map(i -> array[array.length - i]).toArray();
        System.out.println(Arrays.toString(reverseArr));
    }
}
