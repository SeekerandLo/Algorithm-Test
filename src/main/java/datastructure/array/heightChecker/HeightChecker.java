package datastructure.array.heightChecker;

import java.util.Arrays;

/**
 * 学校在拍年度纪念照时，一般要求学生按照 非递减 的高度顺序排列。
 * <p>
 * 请你返回至少有多少个学生没有站在正确位置数量。该人数指的是：能让所有学生以 非递减 高度排列的必要移动人数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/height-checker
 * <p>
 * data: 2019/6/20 14:41
 **/

public class HeightChecker {

    /**
     * 1.先排序，然后比较两个数组间各个数是否相等，不想等的就是要移动的
     */

    public int heightChecker(int[] heights) {
        int result = 0;
        int[] temp = Arrays.copyOf(heights, heights.length);

        Arrays.sort(heights);

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != heights[i]) {
                result++;
            }
        }

        return result;
    }

}
