package com.algo.java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Java Concept Of The Day";
        String reverse = Arrays.stream(str.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
        System.out.println(reverse);
    }
}
