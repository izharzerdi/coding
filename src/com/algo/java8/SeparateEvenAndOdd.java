package com.algo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SeparateEvenAndOdd {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<Boolean, List<Integer>> evenOddMap = listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        Set<Map.Entry<Boolean, List<Integer>>> entrySet = evenOddMap.entrySet();
        entrySet.forEach(entry -> {
            System.out.println("===================");
            if (entry.getKey()) {
                System.out.println("Even numbers");
            } else {
                System.out.println("Odd numbers");
            }
            System.out.println("===================");
            entry.getValue().forEach(System.out::println);
        });
    }
}
