package com.algo.neetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramStrings {
    public static void main(String[] args) {
        String s1 = "carrace";
        String s2 = "racecar";
        boolean anagram1 = isAnagram1(s1, s2);
        printResult(anagram1);
        boolean anagram2 = isAnagram2(s1, s2);
        printResult(anagram2);
        boolean anagram3 = isAnagram3(s1, s2);
        printResult(anagram3);
    }

    private static boolean isAnagram3(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        Map<Character, Integer> s1map = new HashMap<>();
        Map<Character, Integer> s2map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            s1map.put(s1.charAt(i), s1map.getOrDefault(s1.charAt(i), 0) + 1);
            s2map.put(s2.charAt(i), s2map.getOrDefault(s2.charAt(i), 0) + 1);
        }
        return s1map.equals(s2map);
    }

    private static boolean isAnagram2(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }

    private static void printResult(boolean anagram) {
        if (anagram) {
            System.out.println("Is Anagram");
        } else {
            System.out.println("Is not anagram");
        }
    }

    private static boolean isAnagram1(String s1, String s2) {
        String str1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        String str2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        return str1.equals(str2);
    }
}
