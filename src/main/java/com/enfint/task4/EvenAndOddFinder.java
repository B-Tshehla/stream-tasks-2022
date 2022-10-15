package com.enfint.task4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenAndOddFinder {
    Map<CharacterType, Set<String>> findFromCollection(List<Set<String>> input) {
        // TODO: task4
        Map<CharacterType,Set<String>> evenAndOddMap = new HashMap<>();

        if(input == null){
            evenAndOddMap.put(CharacterType.EVEN,new HashSet<>());
            evenAndOddMap.put(CharacterType.ODD,new HashSet<>());
            return evenAndOddMap;
        }

        Set<String> evenSet = input.stream()
                .filter(Objects::nonNull)
                .map(even -> even.stream()
                        .filter(Objects::nonNull)
                        .filter(e -> !e.isEmpty())
                        .filter(e -> e.length() % 2 == 0)
                        .collect(Collectors.toList()))
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());
        Set<String>oddSet = input.stream()
                .filter(Objects::nonNull)
                .map(even -> even.stream()
                        .filter(Objects::nonNull)
                        .filter(e -> !e.isEmpty())
                        .filter(e -> e.length() % 2 != 0)
                .collect(Collectors.toList()))
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());
        evenAndOddMap.put(CharacterType.EVEN,evenSet);
        evenAndOddMap.put(CharacterType.ODD,oddSet);

        return evenAndOddMap;
    }

}
