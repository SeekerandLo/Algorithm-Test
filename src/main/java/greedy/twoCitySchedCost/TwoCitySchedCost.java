package greedy.twoCitySchedCost;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 公司计划面试 2N 人。第 i 人飞往 A 市的费用为 costs[i][0]，飞往 B 市的费用为 costs[i][1]。
 * <p>
 * 返回将每个人都飞到某座城市的最低费用，要求每个城市都有 N 人抵达。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-city-scheduling
 *
 * @author Liy
 * @date 2019/6/30
 **/

public class TwoCitySchedCost {

    public int twoCitySchedCost(int[][] costs) {
        // 差值排序，从差值大的开始分配
        Arrays.sort(costs, (o1, o2) -> Math.abs(o2[0] - o2[1]) - Math.abs(o1[0] - o1[1]));

        int ans = 0;

        int aCount = 0;
        int bCount = 0;

        for (int[] cost : costs) {
            if (cost[0] < cost[1]) {
                ans += cost[0];
                aCount++;
                if (aCount == (costs.length / 2)) {
                    break;
                }
            } else {
                ans += cost[1];
                bCount++;
                if (bCount == (costs.length / 2)) {
                    break;
                }
            }
        }

        // b 齐了
        if (bCount == costs.length / 2) {
            for (int i = aCount + bCount; i < costs.length; i++) {
                ans += costs[i][0];
            }
        }

        // a齐了
        if (aCount == costs.length / 2) {
            for (int i = aCount + bCount; i < costs.length; i++) {
                ans += costs[i][1];
            }
        }


        return ans;
    }

}
