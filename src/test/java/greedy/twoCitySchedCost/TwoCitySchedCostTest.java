package greedy.twoCitySchedCost;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

import static org.junit.Assert.*;

public class TwoCitySchedCostTest {

    TwoCitySchedCost twoCitySchedCost;

    @Before
    public void init() {
        twoCitySchedCost = new TwoCitySchedCost();
    }

    @Test
    public void twoCitySchedCost() {
        int[][] costs = {{259, 770}, {448, 54}, {926, 667}, {184, 139}, {840, 118}, {577, 469}};
        int expect = 1859;
        int actual = twoCitySchedCost.twoCitySchedCost(costs);
        Assert.assertEquals(expect,actual);
    }


    @Test
    public void array_sort_test() {
        // TODO 如何处理 Comparator
        int[][] costs = {{10, 20}, {30, 200}, {400, 50}, {30, 20}};

        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // 大到小
                return Math.abs(o2[0] - o2[1]) - Math.abs(o1[0] - o1[1]);
            }
        });

        for (int[] c : costs) {
            System.out.println(Arrays.toString(c));
        }
    }
}