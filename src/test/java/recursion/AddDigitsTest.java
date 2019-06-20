package recursion;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddDigitsTest {

    @Test
    public void testAddDigits() {
        int data = 38;
        int expect = 2;

        AddDigits addDigits = new AddDigits();
        int actual = addDigits.addDigits(data);

        Assert.assertEquals(expect, actual);
    }

}