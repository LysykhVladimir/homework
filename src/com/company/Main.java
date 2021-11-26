package com.company;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.of(4, 8, 15, 16, -23, -42)
                .collect(Collectors.partitioningBy(integer -> integer > 0 , Collectors.summingInt(Integer::intValue)))
                .forEach((aBoolean, sum) -> System.out.println(aBoolean + ":" + sum));
    }
}