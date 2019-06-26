package datastructure.array.findMedianSortedArrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * <p>
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * <p>
 * 你可以假设 nums1 和 nums2 不会同时为空。
 */
public class FindMedianTest {

    @Test
    public void testFindMedianSortedArrays() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        double expect = 2;

        FindMedian findMedian = new FindMedian();

        double actual = findMedian.simpleFindMedianSortedArrays(nums1, nums2);
        Assert.assertEquals(expect, actual, 0);
    }

    @Test
    public void testFindMedianSortedArrays2() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        double expect = 2.5;

        FindMedian findMedian = new FindMedian();

        double actual = findMedian.simpleFindMedianSortedArrays(nums1, nums2);
        Assert.assertEquals(expect, actual, 0);
    }

}