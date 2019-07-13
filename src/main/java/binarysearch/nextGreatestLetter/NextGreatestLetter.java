package binarysearch.nextGreatestLetter;

/**
 * 给定一个只包含小写字母的有序数组letters 和一个目标字母 target，寻找有序数组里面比目标字母大的最小字母。
 * <p>
 * 数组里字母的顺序是循环的。举个例子，如果目标字母target = 'z' 并且有序数组为 letters = ['a', 'b']，则答案返回 'a'。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-smallest-letter-greater-than-target
 *
 * @author Liy
 * @date 2019/7/8
 **/

public class NextGreatestLetter {

    /**
     * 二分查找中寻找左侧边界
     */
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] > target) {
                right = mid;
            } else if (letters[mid] <= target) {
                left = mid + 1;
            }
        }
        // 如果left还在数组内，则返回最左侧，否则返回第一个
        return left < letters.length ? letters[left] : letters[0];
    }

}
