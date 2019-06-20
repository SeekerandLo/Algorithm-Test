package datastructure.array.findMedianSortedArrays;

/**
 * data: 2019/6/1 10:42
 *
 * v1: 使用归并排序成一个数组然后寻找中位数，时间复杂杜 O(m+n)
 *
 * v2: TODO 时间复杂度要求：O(log(m+n))
 **/

public class FindMedian {

    // didi
    public float simpleFindMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int i = 0, j = 0, k = 0;

        int[] temp = new int[n + m];
        while (i < m && j < n) {
            temp[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
        }

        while (i < m) {
            temp[k++] = nums1[i++];
        }

        while (j < n) {
            temp[k++] = nums2[j++];
        }

        if ((m + n) % 2 == 0) {
            float res = (temp[(m + n) / 2] + temp[(m + n) / 2 - 1]);
            return res / 2;
        } else {
            return temp[(m + n) / 2];
        }
    }

    public float findMedianSortedArrays(int[] nums1, int[] nums2) {

        return 0;
    }
}
