package datastructure.array.numPairsDivisibleBy60;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumPairsDivisibleBy60Test {

    NumPairsDivisibleBy60 numPairsDivisibleBy60;

    @Before
    public void init() {
        numPairsDivisibleBy60 = new NumPairsDivisibleBy60();
    }

    @Test
    public void violence() {
        int[] array = {30, 20, 150, 100, 40};
        int expect = 3;

        int actual = numPairsDivisibleBy60.violence(array);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void mapIdea() {
        int[] array = {30, 20, 150, 100, 40};
        int expect = 3;

        int actual = numPairsDivisibleBy60.mapIdea(array);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void mapIdea_test() {
        int[] array = {60, 60, 60};
        int expect = 3;

        int actual = numPairsDivisibleBy60.mapIdea(array);
        Assert.assertEquals(expect, actual);
    }
}