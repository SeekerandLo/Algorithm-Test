package swordfingerOffer.array.reOrderArray;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Liy
 * @date 2019/7/15
 **/

public class ReOrderArray {


    public void reOrderArray(int[] array) {
        // 空间换时间
        if (array.length == 0) {
            return;
        }

        int[] evenArray = new int[array.length];
        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if ((array[i] & 1) == 1) {
                array[oddIndex++] = array[i];
            } else {
                evenArray[evenIndex++] = array[i];
            }
        }

        for (int i = 0; i < evenIndex; i++) {
            array[oddIndex + i] = evenArray[i];
        }
    }

    public static void main(String[] args) {

        ConcurrentHashMap<String, String> a = new ConcurrentHashMap<>();
        a.put("123", "value");

    }


}
