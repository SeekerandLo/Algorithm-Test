package datastructure.array.canThreePartsEqualSum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CanThreePartsEqualSumTest {

    private CanThreePartsEqualSum canThreePartsEqualSum;

    @Before
    public void init() {
        canThreePartsEqualSum = new CanThreePartsEqualSum();
    }

    @Test
    public void canThreePartsEqualSum() {
        int[] array = {0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1};
        boolean expect = true;
        boolean actual = canThreePartsEqualSum.canThreePartsEqualSum(array);
        Assert.assertEquals(expect, actual);
    }
}