package com.enfint.task2;


import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class ListOperation {

    public static void main(String[] args) {
        List<String> input1 = asList(
                //"при такой планировке 5 станков размещают",
                "За сериями из 3, 5, 12 упражнений следовали перерывы",
                "При массе до 7 кг",
                null,
                "",
                "Сахалин в январе средняя температура колеблется от -16 до -24, на юге от -8 до -18 градусов");

        List<String> input = asList(
                "5 минус 3 равно 2",
                "9 плюс -4 равно 5",
                "1 умножить на 2 равно 2");


        AtomicInteger sum = new AtomicInteger();
        List<Integer> collect = input.stream()
                .map(i -> {
                    String s = i.replaceAll("[^- [0-9]]", " ");
                    String s1 = s.replaceAll(" +", " ");
                    Integer integer;
                    return integer = Arrays.stream(s1.split(" "))
                            .map(Integer::parseInt)
                            .map(sum::addAndGet)
                            .reduce((first, last) -> last).orElse(0);
                }).collect(Collectors.toList());
//                .stream()
//                .reduce((first, last) -> last).orElse(0);

        System.out.println(collect);


    }
    public int integerSum(List<String> input) {

        // TODO: task2
        AtomicInteger sum = new AtomicInteger();

        if (input == null)
            return 0;
        return input.stream()
                .map(i -> {
                    String s = i.replaceAll("[^- [0-9]]", " ");
                    String s1 = s.replaceAll(" +", " ");
                    Integer integer;
                    return integer = Arrays.stream(s1.split(" "))
                            .map(Integer::parseInt)
                            .map(sum::addAndGet)
                            .reduce((first, last) -> last).orElse(0);
                }).collect(Collectors.toList())
                .stream()
                .reduce((first, last) -> last).orElse(0);
    }

}
