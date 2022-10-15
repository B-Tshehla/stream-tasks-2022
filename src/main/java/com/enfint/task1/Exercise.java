package com.enfint.task1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Exercise {

    public static List<Integer> findDuplicates(List<Integer> integerList, int numberOfDuplicates) {
        // TODO: task1
        if (integerList == null)
            return new ArrayList<>();

        return integerList.stream()
                .filter(number -> Collections.frequency(integerList, number) == numberOfDuplicates)
                .filter(Objects::nonNull)
                .distinct()
                .collect(Collectors.toList());
    }

}
