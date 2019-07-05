package greedy.minDeletionSize;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinDeletionSizeTest {

    private MinDeletionSize minDeletionSize;

    @Before
    public void init() {
        minDeletionSize = new MinDeletionSize();

    }

    @Test
    public void minDeletionSize() {
        String[] strings = {"cba", "daf", "ghi"};
        int expect = 1;
        int actual = minDeletionSize.minDeletionSize(strings);
        Assert.assertEquals(expect,actual);
    }
}