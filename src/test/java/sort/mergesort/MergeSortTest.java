package sort.mergesort;

import org.junit.Assert;
import org.junit.Test;
import sort.Sort;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void testSort() {
        int[] arr = {2, 77, 5, 47, 9, 65, 6, 7, 8, 10};
        int[] expectArr = {2, 5, 6, 7, 8, 9, 10, 47, 65, 77};

        MergeSort mergeSort = new MergeSort();
        int[] actualArr = mergeSort.sort(arr);

        Assert.assertArrayEquals(expectArr, actualArr);
    }
}