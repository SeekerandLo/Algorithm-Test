package datastructure.array.heightChecker;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeightCheckerTest {

    HeightChecker heightChecker;

    @Before
    public void init() {
        heightChecker = new HeightChecker();
    }

    @Test
    public void heightChecker_test1() {
        int[] heights = {1, 1, 4, 2, 1, 3};
        int expect = 3;

        int actual = heightChecker.heightChecker(heights);

        Assert.assertEquals(expect, actual);
    }
}