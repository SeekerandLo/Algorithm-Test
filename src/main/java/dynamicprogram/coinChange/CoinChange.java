package dynamicprogram.coinChange;

/**
 * 给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/coin-change
 *
 * @author Liy
 * @date 2019/7/7
 **/

public class CoinChange {

    /**
     * 动态规划
     */
    public int coinChange(int[] coins, int amount) {
        if (amount < 1) {
            return -1;
        }
        return helper(coins, amount, new int[amount]);
    }

    /**
     * @param coins 金额
     * @param rem   此次的子问题
     * @param count 备忘录
     */
    private int helper(int[] coins, int rem, int[] count) {
        if (rem < 0) {
            return -1;
        }
        if (rem == 0) {
            return 0;
        }
        if (count[rem - 1] != 0) {
            return count[rem - 1];
        }
        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int res = helper(coins, rem - coin, count);
            if (res >= 0 && res < min) {
                min = res + 1;
            }
        }
        count[rem - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
        return count[rem - 1];
    }

}
