package binarysearch.searchInsert;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInsertTest {

    SearchInsert searchInsert;

    @Before
    public void init() {
        searchInsert = new SearchInsert();
    }

    @Test
    public void searchInsert() {
        int[] array = {1, 3, 5, 6};
        int target = 7;

        int expect = 4;
        int actual = searchInsert.searchInsert(array, target);
        Assert.assertEquals(expect, actual);
    }
}