package swordfingerOffer.recursion.rectCover;

import java.util.*;

/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 *
 * @author Liy
 * @date 2019/7/14
 **/

public class RectCover {


    public int rectCover(int n) {
        if (n <= 0) {
            return -1;
        }
        if (n == 1 || n == 2) {
            return n;
        }
        return rectCover(n - 1) + rectCover(n - 2);
    }


}
