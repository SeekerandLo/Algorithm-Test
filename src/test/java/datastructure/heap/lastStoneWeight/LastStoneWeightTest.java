package datastructure.heap.lastStoneWeight;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

import static org.junit.Assert.*;

public class LastStoneWeightTest {

    LastStoneWeight lastStoneWeight;

    @Before
    public void init() {
        lastStoneWeight = new LastStoneWeight();
    }

    @Test
    public void lastStoneWeight_test() {
        int[] stones = {4, 8, 7, 3, 5};
        int expect = 1;

        int actual = lastStoneWeight.lastStoneWeight(stones);

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void improvedVersion_test() {
        int[] stones = {4, 8, 7, 3, 5};
        int expect = 1;

        int actual = lastStoneWeight.improvedVersion(stones);

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void arrayCopy() {
        int[] stones = {4, 8, 7, 3, 5};
        System.out.println(Arrays.toString(stones));

        stones = Arrays.copyOf(stones, stones.length - 2);
        System.out.println(Arrays.toString(stones));
    }

    @Test
    public void priorityQueue_test() {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(1);

        queue.add(10);

        queue.add(5);

        queue.add(6);

        queue.add(2);

        System.out.println(queue);
    }
}