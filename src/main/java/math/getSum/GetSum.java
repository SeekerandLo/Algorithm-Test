package math.getSum;

/**
 * 不使用运算符 + 和 - ，计算两整数 ​​​​​​​a 、b ​​​​​​​之和。
 *
 * @author Liy
 * @date 2019/7/5
 **/

public class GetSum {

    public int getSum(int a, int b) {
        int sum, carry;
        sum = a ^ b;

        carry = (a & b) << 1;

        if (carry != 0) {
            return getSum(sum, carry);
        }
        return sum;
    }

    public int getSum2(int a, int b) {
        return b == 0 ? a : getSum((a ^ b), (a & b) << 1);
    }
}
