package com.algo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrefixSuffixString {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String str = listOfStrings.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.println(str);

    }
}
