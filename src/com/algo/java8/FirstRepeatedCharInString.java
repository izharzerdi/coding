package com.algo.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharInString {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        LinkedHashMap<String, Long> linkedHashMap = Arrays.stream(inputString.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        String firstRepeatedChar = linkedHashMap.entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).findFirst().get();
        System.out.println(firstRepeatedChar);

    }
}
