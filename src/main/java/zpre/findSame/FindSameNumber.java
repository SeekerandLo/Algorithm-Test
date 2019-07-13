package zpre.findSame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 *
 * @author Liy
 * @date 2019/7/12
 **/

public class FindSameNumber {

    public List<Integer> findNumsAppearOnce(int[] array, int[] num1, int[] num2) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        num1 = new int[1];
        num2 = new int[1];
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> ansList = new ArrayList<>();
        for (Integer key : countMap.keySet()) {
            if (countMap.get(key) == 1) {
                ansList.add(key);
            }
        }

        num1[0] = ansList.get(0);
        num2[0] = ansList.get(1);
        return ansList;
    }


}
