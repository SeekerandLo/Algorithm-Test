package datastructure.array.reverseString;

/**
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 * <p>
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * <p>
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-string
 *
 * @author Liy
 * @date 2019/7/5
 **/

public class ReverseString {
    public char[] reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            swap(s, left, right);

            left++;
            right--;
        }
        return s;
    }

    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
