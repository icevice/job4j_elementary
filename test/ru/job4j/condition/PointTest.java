package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

import java.awt.Point;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out,0.01);

    }
    @Test
    public void when00to30then3() {
        int expected = 3;
        int x1 = 0;
        int y1 = 0;
        int x2 = 3;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out,0.01);

    }    @Test
    public void when05to30then5() {
        double expected = 5.83;
        int x1 = 0;
        int y1 = 5;
        int x2 = 3;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out,0.01);

    }
}