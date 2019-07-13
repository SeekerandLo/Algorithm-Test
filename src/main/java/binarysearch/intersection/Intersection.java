package binarysearch.intersection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 * https://leetcode-cn.com/problems/intersection-of-two-arrays/
 *
 * @author Liy
 * @date 2019/7/7
 **/

public class Intersection {

    /**
     *
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int value : nums1) {
            set.add(value);
        }

        for (int value : nums2) {
            if (set.contains(value)) {
                list.add(value);
                set.remove(value);
            }
        }

        int[] ans = new int[list.size()];
        int i = 0;
        for (int value : list) {
            ans[i++] = value;
        }
        return ans;
    }

    public int[] intersectionRetainAll(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();

        for (int value : nums1) {
            set1.add(value);
        }

        HashSet<Integer> set2 = new HashSet<>();
        for (int value : nums2) {
            set2.add(value);
        }

        set1.retainAll(set2);

        int[] ans = new int[set1.size()];
        int i = 0;
        for (int value : set1) {
            ans[i++] = value;
        }
        return ans;
    }

}
