package math.isBoomerang;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.Assert.*;

public class IsBoomerangTest {

    IsBoomerang boomerang;

    @Before
    public void init() {
        boomerang = new IsBoomerang();
    }

    @Test
    public void isBoomerang_test() {
        int[][] points = {{1, 1}, {2, 3}, {3, 2}};

        boolean expect = true;

        boolean actual = boomerang.isBoomerang(points);

        Assert.assertEquals(expect, actual);

    }

    @Test
    public void isBoomerang_test2() {
        int[][] points = {{1, 1}, {2, 2}, {3, 3}};

        boolean expect = false;

        boolean actual = boomerang.isBoomerang(points);

        Assert.assertEquals(expect, actual);

    }

    @Test
    public void isBoomerang_test3() {
        int[][] points = {{0, 0}, {0, 2}, {2, 1}};

        boolean expect = true;

        boolean actual = boomerang.isBoomerang(points);

        Assert.assertEquals(expect, actual);

    }

    @Test
    public void isBoomerang_test4() {
        int[][] points = {{0, 1}, {0, 1}, {2, 1}};

        boolean expect = false;

        boolean actual = boomerang.isBoomerang(points);

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void isBoomerang_test5() {
        int[][] points = {{0, 1}, {1, 0}, {0, 1}};

        boolean expect = false;

        boolean actual = boomerang.isBoomerang(points);

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void isBoomerang_test6() {
        int[][] points = {{0, 1}, {1, 1}, {2, 2}};

        boolean expect = true;

        boolean actual = boomerang.isBoomerang(points);

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void isBoomerang_test7() {
        int[][] points = {{0, 0}, {2, 1}, {2, 2}};

        boolean expect = true;

        boolean actual = boomerang.isBoomerang(points);

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void isBoomerang_test8() {
        int[][] points = {{52, 68}, {23, 63}, {46, 67}};

        boolean expect = true;

        boolean actual = boomerang.isBoomerang(points);

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void isBoomerang_test9() {
        int[][] points = {{1, 0}, {0, 0}, {2, 0}};

        boolean expect = false;

        boolean actual = boomerang.isBoomerang(points);

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void test_div() {
        BigDecimal a = BigDecimal.valueOf(1);
        BigDecimal b = BigDecimal.valueOf(2);
        BigDecimal slope = a.divide(b, 2, RoundingMode.HALF_UP);
        System.out.println(slope);
    }
}