package math.bitwiseComplement;

/**
 * 每个非负整数 N 都有其二进制表示。例如， 5 可以被表示为二进制 "101"，11 可以用二进制 "1011" 表示，依此类推。注意，除 N = 0 外，任何二进制表示中都不含前导零。
 * <p>
 * 二进制的反码表示是将每个 1 改为 0 且每个 0 变为 1。例如，二进制数 "101" 的二进制反码为 "010"。
 * <p>
 * 给定十进制数 N，返回其二进制表示的反码所对应的十进制整数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/complement-of-base-10-integer
 *
 * @author Liy
 * @date 2019/6/27
 **/

public class BitwiseComplement {

    /**
     *
     */
    public int bitwiseComplement(int n) {
        if (n == 0) {
            return 1;
        }
        int ans = 0;
        // 控制当前是第几位
        int i = 0;
        while (n > 0) {
            int temp = n & 0x1;
            ans += Math.pow(2, i) * (temp == 0 ? 1 : 0);
            i++;
            n = n >> 1;
        }
        return ans;
    }
}


