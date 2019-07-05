package datastructure.array.sumEvenAfterQueries;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumEvenAfterQueriesTest {

    private SumEvenAfterQueries sumEvenAfterQueries;

    @Before
    public void init() {
        sumEvenAfterQueries = new SumEvenAfterQueries();
    }

    @Test
    public void sumEvenAfterQueries() {
        int[] array = {1, 2, 3, 4};
        int[][] queries = {
                {1, 0}, {-3, 1}, {-4, 0}, {2, 3}
        };

        int[] expect = {8, 6, 2, 4};
        int[] actual = sumEvenAfterQueries.sumEvenAfterQueries(array, queries);
        Assert.assertArrayEquals(expect, actual);
    }

    @Test
    public void test() {
        for (int i = 0; i < 10; i++) {
            if ((i & 1) == 0) {
                System.out.println(i);
            }
        }
    }
}