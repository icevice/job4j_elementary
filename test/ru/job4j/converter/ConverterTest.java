package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        double in = 140;
        double expected = 2.3333333333333335;
        double out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out, 0.001);
    }
}