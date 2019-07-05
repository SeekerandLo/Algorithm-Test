package greedy.maxProfit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxProfitTest {


    MaxProfit maxProfit;

    @Before
    public void init() {
        maxProfit = new MaxProfit();
    }

    @Test
    public void maxProfit() {

        int[] prices = {7, 1, 5, 3, 6, 4};

        int expect = 7;

        int actual = maxProfit.maxProfit(prices);

        Assert.assertEquals(expect, actual);

    }
}