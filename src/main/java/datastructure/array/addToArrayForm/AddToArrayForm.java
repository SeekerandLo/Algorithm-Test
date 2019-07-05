package datastructure.array.addToArrayForm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 对于非负整数 X 而言，X 的数组形式是每位数字按从左到右的顺序形成的数组。例如，如果 X = 1231，那么其数组形式为 [1,2,3,1]。
 * <p>
 * 给定非负整数 X 的数组形式 A，返回整数 X+K 的数组形式。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-to-array-form-of-integer
 *
 * @author Liy
 * @date 2019/6/28
 **/

public class AddToArrayForm {


    /**
     * 按位相加法，从数组最后一位开始，将K直接加到最后一位，然后保留除10的余数，其余进位到下一次，直到当到数组的第一个，
     * 如果还有进位也要加一位
     */
    public List<Integer> addToArrayForm(int[] array, int k) {

        int i = array.length;
        int cur = k;

        List<Integer> ans = new ArrayList<>();

        while (--i >= 0 || cur > 0) {
            if (i >= 0) {
                cur += array[i];
            }
            ans.add(cur % 10);
            cur /= 10;
        }
        // 反转
        Collections.reverse(ans);
        return ans;
    }

}
