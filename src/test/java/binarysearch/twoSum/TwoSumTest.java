package binarysearch.twoSum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    TwoSum twoSum;

    @Before
    public void init() {
        twoSum = new TwoSum();
    }

    @Test
    public void twoSum() {
        int[] array = {2, 7, 11, 15};
        int target = 9;

        int[] expect = {1, 2};
        int[] actual = twoSum.twoSum(array, target);

        Assert.assertArrayEquals(expect, actual);
    }
}