package com.algo.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMin3Numbers {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        System.out.println("Minimum 3 numbers are: ");
        listOfIntegers.stream().sorted().limit(3).forEach(System.out::println);
        System.out.println("--------------------");
        System.out.println("Maximum 3 numbers are");
        listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

    }
}
