package datastructure.string.gcdOfStrings;

/**
 * 求最大公约数
 * <p>
 * data: 2019/6/20 14:07
 **/

public class GcdDescription {

    public int gcdDescription(Integer a, Integer b) {

        return b == 0 ? a : gcdDescription(b, a % b);

    }


}

