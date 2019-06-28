package datastructure.array.prefixesDivBy5;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定由若干 0 和 1 组成的数组 A。我们定义 N_i：从 A[0] 到 A[i] 的第 i 个子数组被解释为一个二进制数（从最高有效位到最低有效位）。
 * <p>
 * 返回布尔值列表 answer，只有当 N_i 可以被 5 整除时，答案 answer[i] 为 true，否则为 false。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-prefix-divisible-by-5
 *
 * @author Liy
 * @date 2019/6/27
 **/

public class PrefixesDivBy5 {

    /**
     * 答案是一个和array长度相等的数组
     * <p>
     * 碰到二进制 ，可以使用位运算，每次将上一个数字左移，使用或运算
     */
    public List<Boolean> prefixesDivBy5(int[] array) {
        List<Boolean> ansList = new ArrayList<>();
        int sum = 0;
        for (int value : array) {
            sum = sum << 1;
            sum = sum + value;
            if (sum % 5 == 0) {
                ansList.add(true);
            } else {
                ansList.add(false);
            }
            // 有可能越界，只要余数是5的倍数就能整除
            sum = sum % 5;
        }
        return ansList;
    }

}
