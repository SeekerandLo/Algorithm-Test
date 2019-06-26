package sort.allCellsDistOrder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AllCellsDistOrderTest {

    AllCellsDistOrder allCellsDistOrder;

    @Before
    public void init() {
        allCellsDistOrder = new AllCellsDistOrder();
    }

    @Test
    public void allCellsDistOrder() {
        int r = 1, c = 2, r0 = 0, c0 = 0;

        int[][] expect = {{0, 0}, {0, 1}};

        int[][] actual = allCellsDistOrder.allCellsDistOrder(r, c, r0, c0);

        Assert.assertArrayEquals(expect, actual);
    }

    @Test
    public void allCellsDistOrder_test2() {
        int r = 2, c = 2, r0 = 0, c0 = 1;

        int[][] expect = {{0, 1}, {0, 0}, {1, 1}, {1, 0}};

        int[][] actual = allCellsDistOrder.allCellsDistOrder(r, c, r0, c0);

        Assert.assertArrayEquals(expect, actual);
    }
}