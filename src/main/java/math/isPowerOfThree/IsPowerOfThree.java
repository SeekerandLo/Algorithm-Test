package math.isPowerOfThree;

/**
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。
 * <p>
 * 不用循环或递归
 *
 * @author Liy
 * @date 2019/7/6
 **/

public class IsPowerOfThree {
    /**
     * 三进制
     * <p>
     * 效仿二进制
     * <p>
     * 2 -> 0010
     * 4 -> 0100
     * 8 -> 1000
     * 16 -> 1 0000
     * 转换为二进制，二进制数只有一个 1 时为 2 的幂
     * 3 ->
     */
    public boolean isPowerOfThreeThreeSystem(int n) {
        String threeSystem = Integer.toString(n, 3);
        return threeSystem.matches("^10*$");
    }

    /**
     * 计算法
     */
    public boolean isPowerOfThreeMathCalculate(int n) {
//        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
        return false;
    }
}
