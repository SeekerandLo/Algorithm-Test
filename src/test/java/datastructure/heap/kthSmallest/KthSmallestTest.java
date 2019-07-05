package datastructure.heap.kthSmallest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KthSmallestTest {

    KthSmallest kthSmallest;

    @Before
    public void init() {
        kthSmallest = new KthSmallest();
    }

    @Test
    public void kthSmallest() {
        int[][] arr = {{-5}};
        int k = 1;

        System.out.println(kthSmallest.kthSmallest(arr, k));

    }
}