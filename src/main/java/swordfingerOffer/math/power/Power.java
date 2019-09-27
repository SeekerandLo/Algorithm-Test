package swordfingerOffer.math.power;

import java.util.LinkedList;
import java.util.Vector;

/**
 * @author Liy
 * @date 2019/7/15
 **/

public class Power {

    public static double power(double base, int exponent) {


        double ans = 1;
        for (int i = 0; i < Math.abs(exponent); i++) {
            ans *= base;
        }
        if (exponent < 0) {
            ans = 1/ans;
        }
        return ans;
    }

    public static void main(String[] args) {

        System.out.println(power(2.0, 3));

    }
}
