package search.fourSumCount;

import java.util.HashMap;

/**
 * 给定四个包含整数的数组列表 A , B , C , D ,计算有多少个元组 (i, j, k, l) ，使得 A[i] + B[j] + C[k] + D[l] = 0。
 * <p>
 * 为了使问题简单化，所有的 A, B, C, D 具有相同的长度 N，且 0 ≤ N ≤ 500 。所有整数的范围在 -228 到 228 - 1 之间，最终结果不会超过 231 - 1 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/4sum-ii
 *
 * @author Liy
 * @date 2019/7/4
 **/

public class FourSumCount {

    /**
     * HashMap 的思路，先计算 A 数组和 B 数组的所有可能和，放到 map 中，key = 值，value = 次数
     * <p>
     * 再计算 C D 数组中的所有可能和，但是是和 map 中的相加成0 的
     */
    public int fourSumCount(int[] aArray, int[] bArray, int[] cArray, int[] dArray) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int item : aArray) {
            for (int value : bArray) {
                int sum = item + value;
                if (map.containsKey(sum)) {
                    map.put(sum, map.get(sum) + 1);
                } else {
                    map.put(sum, 1);
                }
            }
        }


        for (int value : cArray) {
            for (int j = 0; j < cArray.length; j++) {
                int sum = value + dArray[j];
                if (map.containsKey(-sum)) {
                    ans+=map.get(-sum);
                }
            }
        }
        return ans;
    }

}
