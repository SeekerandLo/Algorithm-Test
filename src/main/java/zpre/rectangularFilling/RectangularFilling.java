package zpre.rectangularFilling;

/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * @author Liy
 * @date 2019/7/12
 **/

public class RectangularFilling {

    public int rectangularFilling(int number) {
        if (number < 0) {
            return 0;
        }
        if (number == 1) {
            return 1;

        }
        if (number == 2) {
            return 2;
        }
        return rectangularFilling(number - 1) + rectangularFilling(number - 2);
    }
}
