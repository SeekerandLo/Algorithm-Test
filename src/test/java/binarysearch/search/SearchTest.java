package binarysearch.search;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchTest {

    Search search;

    @Before
    public void init() {
        search = new Search();
    }

    @Test
    public void search() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;

        int expect = -1;
        int actual = search.search(nums, target);
        Assert.assertEquals(expect, actual);
    }
}