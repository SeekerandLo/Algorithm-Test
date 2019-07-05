package datastructure.array.sumEvenAfterQueries;

/**
 * 给出一个整数数组 A 和一个查询数组 queries。
 * <p>
 * 对于第 i 次查询，有 val = queries[i][0], index = queries[i][1]，我们会把 val 加到 A[index] 上。然后，第 i 次查询的答案是 A 中偶数值的和。
 * <p>
 * （此处给定的 index = queries[i][1] 是从 0 开始的索引，每次查询都会永久修改数组 A。）
 * <p>
 * 返回所有查询的答案。你的答案应当以数组 answer 给出，answer[i] 为第 i 次查询的答案。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sum-of-even-numbers-after-queries
 *
 * @author Liy
 * @date 2019/6/28
 **/

public class SumEvenAfterQueries {

    /**
     * 直接法，很慢
     */
    public int[] sumEvenAfterQueries(int[] array, int[][] queries) {
        int count = queries.length;
        int[] ans = new int[count];

        for (int i = 0; i < count; i++) {
            int val = queries[i][0];
            int index = queries[i][1];

            array[index] += val;

            int sum = 0;
            for (int value : array) {
                if ((value & 1) == 0) {
                    sum += value;
                }
            }

            ans[i] = sum;
        }

        return ans;
    }

}
