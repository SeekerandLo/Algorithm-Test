package binarysearch.isPerfectSquare;

/**
 * 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
 * <p>
 * 说明：不要使用任何内置的库函数，如  sqrt。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-perfect-square
 *
 * @author Liy
 * @date 2019/7/8
 **/

public class IsPerfectSquare {

    /**
     * 二分法
     */
    public boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (Math.pow(mid, 2) == num) {
                return true;
            } else if (Math.pow(mid, 2) > num) {
                right = mid - 1;
            } else if (Math.pow(mid, 2) < num) {
                left = mid + 1;
            }
        }
        return false;
    }

}
