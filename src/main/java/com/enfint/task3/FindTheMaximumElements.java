package com.enfint.task3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FindTheMaximumElements {




    public List<BigDecimal> getThreeMaximum(List<String> input) {
        // TODO: task3
        if (input == null)
            return new ArrayList<>();
        return input.stream()
                .filter(Objects::nonNull)
                .map(Double::parseDouble)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .map(Double::intValue)
                .map(BigDecimal::valueOf)
                .collect(Collectors.toList());
    }

}
