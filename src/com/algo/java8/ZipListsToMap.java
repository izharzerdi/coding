package com.algo.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ZipListsToMap {
    public static void main(String[] args) {
        List<String> keys = List.of("A", "B", "C");
        List<Integer> values = List.of(1, 2, 3);
        Map<String, Integer> collect = IntStream.range(0, Math.min(keys.size(), values.size())).boxed()
                .collect(Collectors.toMap(keys::get, values::get));
        System.out.println(collect);

    }
}
