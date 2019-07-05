package datastructure.array.intersect;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * @author Liy
 * @date 2019/7/5
 **/

public class Intersect {

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> num1List = new ArrayList<>();
        for (int num : nums1) {
            num1List.add(num);
        }

        List<Integer> num2List = new ArrayList<>();
        for (int num : nums2) {
            if (num1List.contains(num)) {
                num2List.add(num);
                num1List.remove(Integer.valueOf(num));
            }
        }

        int[] ans = new int[num2List.size()];
        int i = 0;
        for (int num : num2List) {
            ans[i++] = num;
        }
        return ans;
    }
}

