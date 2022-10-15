package com.enfint.task3;

import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import junit.framework.TestCase;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindTheMaximumElementsTest extends TestCase {

    private final FindTheMaximumElements findTheMax = new FindTheMaximumElements();

    public void testGetThreeMaximum() {
        List<BigDecimal> result = findTheMax.getThreeMaximum(asList("32", "4", "-25", "45", "99", "456", "161", "9", "14", "95", "61.5", "2", "3"));

        assertThat(asList(new BigDecimal("456"), new BigDecimal("161"), new BigDecimal("99")), containsInAnyOrder(result.toArray()));
    }

    public void testGetThreeMaximumWithNulls() {
        List<BigDecimal> result = findTheMax.getThreeMaximum(asList("32", "4", "-25", "45", null, "456", "161", "9", "14", "95", "61", null, "3"));

        Assert.assertTrue(result.stream().anyMatch(decimal ->
                decimal.equals(new BigDecimal("456"))));
        Assert.assertTrue(result.stream().anyMatch(decimal ->
                decimal.equals(new BigDecimal("161"))));
        Assert.assertTrue(result.stream().anyMatch(decimal ->
                decimal.equals(new BigDecimal("95"))));
    }

    public void testGetThreeMaximumNullList() {
        List<BigDecimal> result = findTheMax.getThreeMaximum(null);

        Assert.assertTrue(result.isEmpty());
    }

    public void testGetThreeMaximumWithRandom() {
        List<String> randomList = getRandomList();

        List<BigDecimal> result = findTheMax.getThreeMaximum(randomList);

        assertThat(getMaxElementsWithoutStream(randomList), containsInAnyOrder(result.toArray()));
    }

    public void testGetThreeMaximumWithRandomAgain() {
        List<String> randomList = getRandomList();

        List<BigDecimal> result = findTheMax.getThreeMaximum(randomList);

        assertThat(getMaxElementsWithoutStream(randomList), containsInAnyOrder(result.toArray()));
    }

    private List<String> getRandomList() {
        return Stream.generate(() -> RandomStringUtils.random(5, false, true))
                     .limit(25)
                     .collect(Collectors.toList());
    }

    private List<BigDecimal> getMaxElementsWithoutStream(List<String> input) {
        BigDecimal[] array = new BigDecimal[input.size()];
        int position = 0;
        for (String current : input) {
            array[position++] = new BigDecimal(current);
        }
        Arrays.sort(array);
        return asList(array[array.length - 1],
                array[array.length - 2],
                array[array.length - 3]);
    }
}