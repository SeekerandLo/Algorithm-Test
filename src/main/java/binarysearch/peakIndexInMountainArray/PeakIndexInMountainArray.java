package binarysearch.peakIndexInMountainArray;

/**
 * 我们把符合下列属性的数组 A 称作山脉：
 * <p>
 * A.length >= 3
 * 存在 0 < i < A.length - 1 使得A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
 * 给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] 的 i 的值。
 * <p>
 *  
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/peak-index-in-a-mountain-array
 *
 * @author Liy
 * @date 2019/7/7
 **/

public class PeakIndexInMountainArray {

    /**
     * 已经给定了是山脉数组，那么确定结果索引的条件就是比左边的大，也比右边的大
     */
    public int peakIndexInMountainArray(int[] array) {
        int low = 0, high = array.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (array[mid] > array[mid - 1] && array[mid] > array[mid + 1]) {
                return mid;
            } else if (array[mid] < array[mid - 1]) {
                high = mid;
            } else {
                low = mid;
            }
        }
        return -1;
    }

}
