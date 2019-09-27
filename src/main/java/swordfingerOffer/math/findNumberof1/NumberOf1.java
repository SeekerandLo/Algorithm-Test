package swordfingerOffer.math.findNumberof1;

/**
 * @author Liy
 * @date 2019/7/15
 **/

public class NumberOf1 {

    public int findNumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }

}
