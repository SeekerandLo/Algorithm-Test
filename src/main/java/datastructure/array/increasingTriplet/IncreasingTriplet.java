package datastructure.array.increasingTriplet;

import java.util.Arrays;

/**
 * 给定一个未排序的数组，判断这个数组中是否存在长度为 3 的递增子序列。
 * <p>
 * 数学表达式如下:
 * <p>
 * 如果存在这样的 i, j, k,  且满足 0 ≤ i < j < k ≤ n-1，
 * 使得 arr[i] < arr[j] < arr[k] ，返回 true ; 否则返回 false 。
 * 说明: 要求算法的时间复杂度为 O(n)，空间复杂度为 O(1) 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/increasing-triplet-subsequence
 *
 * @author Liy
 * @date 2019/7/5
 **/

public class IncreasingTriplet {

    /**
     * 维护两个值，small，big
     *
     * 如果数组长度小于等于2，肯定返回false
     *
     * 如果长度符合了，那么取数组第一个为最小值 small，开始遍历数组
     * 当有值小于small 时，替换掉它，让small一直保持数组中最小的值。
     *
     * 当有值大于small 小于 big 时，说明它现在是第二小的值，如果有递增三元序列的话，也是中间的那个值，这里将 big 替换成它。
     * 这个值会不断的更新，因为是寻找第二小的值
     *
     * 继续遍历，如果再有值大于big，说明有三元序列。
     */
    public boolean increasingTriplet(int[] nums) {
        if (nums.length <= 2) {
            return false;
        }
        int i = 0;
        int small = nums[0];
        int big = Integer.MAX_VALUE;

        while (i < nums.length) {
            if (nums[i] < small) {
                small = nums[i];
            } else if (nums[i] > small && nums[i] < big) {
                big = nums[i];
            } else if (nums[i] > big) {
                return true;
            }
            i++;
        }
        return false;
    }

}
