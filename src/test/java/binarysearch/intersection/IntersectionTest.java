package binarysearch.intersection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntersectionTest {

    Intersection intersection;

    @Before
    public void init() {
        intersection = new Intersection();
    }

    @Test
    public void intersectionRetainAll() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] expect = {9, 4};

        int[] actual = intersection.intersectionRetainAll(nums1, nums2);
        Assert.assertArrayEquals(expect, actual);
    }
}