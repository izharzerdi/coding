package com.algo.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfDigits {
    public static void main(String[] args) {
        int i = 15623;
        Integer sum = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
        // Integer sum = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();
        System.out.println(sum);
    }
}
