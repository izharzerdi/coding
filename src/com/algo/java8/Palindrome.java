package com.algo.java8;

import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        String str = "MADAM";
        boolean isPalindrome = IntStream.range(0, str.length() / 2).noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));
        if (isPalindrome) {
            System.out.println("Is Palindrome");
        } else {
            System.out.println("Is not palindrome");
        }
    }
}
