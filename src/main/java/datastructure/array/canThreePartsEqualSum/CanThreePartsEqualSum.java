package datastructure.array.canThreePartsEqualSum;

/**
 * 给定一个整数数组 A，只有我们可以将其划分为三个和相等的非空部分时才返回 true，否则返回 false。
 * <p>
 * 形式上，如果我们可以找出索引 i+1 < j 且满足 (A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1]) 就可以将数组三等分。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/partition-array-into-three-parts-with-equal-sum
 *
 * @author Liy
 * @date 2019/6/27
 **/

public class CanThreePartsEqualSum {

    /**
     * 能三等分的前提是这个数组的和能够被三整除
     * <p>
     * <p>
     * 算出平均值，从数组第一位开始计算，
     * <p>
     * 维护一个标记，代表数组中几个数和为平均值的次数
     * <p>
     * 最后如果标记为3，表示true
     */
    public boolean canThreePartsEqualSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }

        int average = sum / 3;
        int temp = 0;

        for (int value : array) {
            average = average - value;
            if (average == 0) {
                temp++;
                average = sum / 3;
            }
        }

        return temp == 3;
    }

}
