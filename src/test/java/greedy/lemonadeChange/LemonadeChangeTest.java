package greedy.lemonadeChange;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LemonadeChangeTest {

    LemonadeChange lemonadeChange;

    @Before
    public void init() {
        lemonadeChange = new LemonadeChange();
    }

    @Test
    public void lemonadeChange() {
        int[] bills = {5, 5, 5, 10, 20};
        boolean expect = true;
        boolean actual = lemonadeChange.lemonadeChange(bills);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void lemonadeChange_test2() {
        int[] bills = {5, 5, 10, 10, 20};
        boolean expect = false;
        boolean actual = lemonadeChange.lemonadeChange(bills);
        Assert.assertEquals(expect, actual);
    }
}