package com.algo.java8;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringWordLength {
    public static void main(String[] args) {
        List<String> input = List.of("cat", "dog", "elephant", "cat", "lion");
        Map<String, Integer> stringMap = input.stream().collect(Collectors.toMap(Function.identity(), String::length, Math::max));
        System.out.println(stringMap);

    }
}
