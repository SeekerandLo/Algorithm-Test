package dynamicprogram.coinChange;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoinChangeTest {

    private CoinChange coinChange;

    @Before
    public void init() {
        coinChange = new CoinChange();
    }

    @Test
    public void coinChange() {
        int[] coins = {1, 2, 5};
        int amount = 11;

        int expect = 3;
        int actual = coinChange.coinChange(coins, amount);
        Assert.assertEquals(expect, actual);
    }
}