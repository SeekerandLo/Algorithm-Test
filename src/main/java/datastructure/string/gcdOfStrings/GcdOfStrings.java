package datastructure.string.gcdOfStrings;

/**
 * 对于字符串 S 和 T，只有在 S = T + ... + T（T 与自身连接 1 次或多次）时，我们才认定 “T 能除尽 S”。
 * <p>
 * 返回字符串 X，要求满足 X 能除尽 str1 且 X 能除尽 str2
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/greatest-common-divisor-of-strings
 * <p>
 * data: 2019/6/20 11:24
 **/

public class GcdOfStrings {

    /**
     * 1.如果两个字符串存在“最大公约数”，那么这两个字符串应该完全由多个最大公约数组成，最大公约数的长度为 n
     * 2. str1.length = x*n  str2.length = x*m
     * 3. 求两个字符串的长度的最大公约数，在一个串中找出最大公约数的长度的前缀字串
     * 4. 替换str1，str2中的上述字串，如果最后两个长度都为0，则上述字串即是结果
     */

    public String gcdOfStrings(String str1, String str2) {
        int gcd = gcdDescription(str1.length(), str2.length());

        String subStr1 = str1.substring(0, gcd);

        str1 = str1.replace(subStr1, "");
        str2 = str2.replace(subStr1, "");

        System.out.println(str1);
        System.out.println(str2);

        if (str1.length() == 0 && str2.length() == 0) {
            return subStr1;
        } else {
            return "";
        }
    }


    private int gcdDescription(Integer a, Integer b) {
        return b == 0 ? a : gcdDescription(b, a % b);
    }

}
