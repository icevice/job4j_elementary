package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.condition.Max;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        {
            int result = Factorial.calc(5);
            int expected = 120;
            Assert.assertEquals(result, expected);

        }
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int result = Factorial.calc(0);
        int expected = 1;
        Assert.assertEquals(result, expected);
    }
}