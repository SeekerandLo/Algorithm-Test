package datastructure.array.numRookCaptures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumRookCapturesTest {

    NumRookCaptures numRookCaptures;

    @Before
    public void init() {
        numRookCaptures = new NumRookCaptures();
    }

    @Test
    public void numRookCaptures() {
        char[][] arr = {{'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', 'p', '.', '.', '.', '.'}, {
                '.', '.', '.', 'R', '.', '.', '.', 'p'}, {'.', '.', '.', '.', '.', '.', '.', '.'}, {
                '.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', 'p', '.', '.', '.', '.'}, {
                '.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.'}};

        int expect = 3;
        int actual = numRookCaptures.numRookCaptures(arr);

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void numRookCaptures_test2() {
        char[][] arr = {
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', 'p', 'p', 'p', 'p', 'p', '.', '.'},
                {'.', 'p', 'p', 'B', 'p', 'p', '.', '.'},
                {'.', 'p', 'B', 'R', 'B', 'p', '.', '.'},
                {'.', 'p', 'p', 'B', 'p', 'p', '.', '.'},
                {'.', 'p', 'p', 'p', 'p', 'p', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}
        };
        int expect = 0;
        int actual = numRookCaptures.numRookCaptures(arr);

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void numRookCaptures_test3() {
        char[][] arr = {
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'p', 'p', '.', 'R', '.', 'p', 'B', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'B', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}
        };
        int expect = 3;
        int actual = numRookCaptures.numRookCaptures(arr);

        Assert.assertEquals(expect, actual);
    }

}