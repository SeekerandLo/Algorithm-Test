package datastructure.stack.removeOuterParentheses;

/**
 * 有效括号字符串为空 ("")、"(" + A + ")" 或 A + B，其中 A 和 B 都是有效的括号字符串，+ 代表字符串的连接。例如，""，"()"，"(())()" 和 "(()(()))" 都是有效的括号字符串。
 * <p>
 * 如果有效字符串 S 非空，且不存在将其拆分为 S = A+B 的方法，我们称其为原语（primitive），其中 A 和 B 都是非空有效括号字符串。
 * <p>
 * 给出一个非空有效字符串 S，考虑将其进行原语化分解，使得：S = P_1 + P_2 + ... + P_k，其中 P_i 是有效括号字符串原语。
 * <p>
 * 对 S 进行原语化分解，删除分解中每个原语字符串的最外层括号，返回 S 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-outermost-parentheses
 *
 * @author Liy
 * @date 2019/6/26
 **/

public class RemoveOuterParentheses {

    /**
     * 计数法：定义标记位，一个左括号加1，一个右括号减1，当经历左括号后是1的时候，这个左括号是最外层的，
     * 当经历了一个右括号是0的时候，这个右括号是最外层的
     */
    public String removeOuterParentheses(String s) {
        char[] chars = s.toCharArray();
        int mark = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (char cur : chars) {
            if (cur == '(') {
                mark++;
                if (mark == 1) {
                    continue;
                }
            } else if (cur == ')') {
                mark--;
                if (mark == 0) {
                    continue;
                }
            }
            stringBuilder.append(cur);
        }
        return stringBuilder.toString();
    }


}
