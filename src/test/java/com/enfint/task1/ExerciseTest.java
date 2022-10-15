package com.enfint.task1;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

public class ExerciseTest {

    @Test
    public void shouldReturnListWithRepeatedTwoValues() {
        Exercise exercise = new Exercise();

        List<Integer> result = exercise.findDuplicates(asList(-1, 1, 3, 2, 5, 6, -1, 3, 6), 2);
        assertThat(asList(-1, 3, 6), containsInAnyOrder(result.toArray()));
    }

    @Test
    public void nullValuesShouldBeOmitted() {
        Exercise exercise = new Exercise();

        List<Integer> result = exercise.findDuplicates(asList(1, 1, null, 2, 5, 6, 1, 3, 6, null), 2);

        assertEquals(singletonList(6), result);
    }

    @Test
    public void shouldReturnListWithRepeatedFourTimes() {
        Exercise exercise = new Exercise();

        List<Integer> result = exercise.findDuplicates(asList(-1, 1, 3, 2, 5, 6, 3, -1, 3, 6, 3), 4);

        assertThat(Collections.singletonList(3), containsInAnyOrder(result.toArray()));
    }

    @Test
    public void shouldReturnListWithRepeatedValuesThreeTimes() {
        Exercise exercise = new Exercise();

        List<Integer> result = exercise.findDuplicates(asList(-1, 6, 1, 3, 2, -1, 5, 6, -1, 3, 6), 3);

        assertThat(asList(-1, 6), containsInAnyOrder(result.toArray()));
    }

    @Test
    public void shouldReturnEmptyList() {
        Exercise exercise = new Exercise();

        List<Integer> result = exercise.findDuplicates(null, 2);

        assertThat(Collections.emptyList(), containsInAnyOrder(result.toArray()));
    }
}
