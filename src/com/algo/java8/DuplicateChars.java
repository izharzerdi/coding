package com.algo.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateChars {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        Set<String> uniqueChars = new HashSet<>();
        Set<String> dupChars = Arrays.stream(inputString.split("")).filter(ch -> !uniqueChars.add(ch)).collect(Collectors.toSet());
        System.out.println(dupChars);
    }
}
