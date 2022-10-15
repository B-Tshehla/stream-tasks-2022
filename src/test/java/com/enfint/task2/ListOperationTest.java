package com.enfint.task2;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.List;

public class ListOperationTest {

    @Test
    public void shouldReturnZeroIfStringsWithNoIntegers() {
        ListOperation listOperation = new ListOperation();
        List<String> stringsWithoutIntegers = asList(
                "Позволяющих найти решение той или иной научной задачи",
                "Сорок восемь видов змей живут в этом зоопарке");

        int actualSum = listOperation.integerSum(stringsWithoutIntegers);

        assertEquals("Фактическая сумма равна 0", 0, actualSum);
    }

    @Test
    public void shouldReturnSumIfStringsWithIntegers() {
        ListOperation listOperation = new ListOperation();
        List<String> stringsWithIntegers = asList(
                "5 минус 3 равно 2",
                "9 плюс -4 равно 5",
                "1 умножить на 2 равно 2");

        int actualSum = listOperation.integerSum(stringsWithIntegers);

        assertEquals("Ожидается сумма 25", 25, actualSum);
    }

    @Test
    public void shouldReturnZeroIfNullPassed() {
        ListOperation listOperation = new ListOperation();

        int actualSum = listOperation.integerSum(null);

        assertEquals("Сумма для значения null должна быть 0", 0, actualSum);
    }

    @Test
    public void shouldReturnSumIfStringsWithIntegersSecond() {
        ListOperation listOperation = new ListOperation();
        List<String> stringsWithIntegers = asList(
                "при такой планировке 5 станков размещают",
                "За сериями из 3, 5, 12 упражнений следовали перерывы",
                "При массе до 7 кг",
                null,
                "",
                "Сахалин в январе средняя температура колеблется от -16 до -24, на юге от -8 до -18 градусов");

        int actualSum = listOperation.integerSum(stringsWithIntegers);

        assertEquals("Ожидается сумма -34", -34, actualSum);
    }

}
