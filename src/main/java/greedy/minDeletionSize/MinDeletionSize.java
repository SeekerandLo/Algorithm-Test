package greedy.minDeletionSize;

/**
 * 给定由 N 个小写字母字符串组成的数组 A，其中每个字符串长度相等。
 * <p>
 * 选取一个删除索引序列，对于 A 中的每个字符串，删除对应每个索引处的字符。 所余下的字符串行从上往下读形成列。
 * <p>
 * 比如，有 A = ["abcdef", "uvwxyz"]，删除索引序列 {0, 2, 3}，删除后 A 为["bef", "vyz"]， A 的列分别为["b","v"], ["e","y"], ["f","z"]。（形式上，第 n 列为 [A[0][n], A[1][n], ..., A[A.length-1][n]]）。
 * <p>
 * 假设，我们选择了一组删除索引 D，那么在执行删除操作之后，A 中所剩余的每一列都必须是 非降序 排列的，然后请你返回 D.length 的最小可能值。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/delete-columns-to-make-sorted
 *
 * @author Liy
 * @date 2019/6/29
 **/

public class MinDeletionSize {

    /**
     * 综上所述，比较各列，如果上一列的大于下一列的，则不符合规定，就要删除掉，删掉就是加入到删除索引中，
     * <p>
     * ps:最小这里我不太明白，按上面的计算，算出的是唯一的，没有浮动
     */
    public int minDeletionSize(String[] array) {
        int ans = 0;
        // 构建二维数组
        int col = array[0].length();
        int row = array.length;
        char[][] chars = new char[row][col];
        // 将字符填充到二维数组中
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                chars[i][j] = array[i].charAt(j);
            }
        }

        for (int i = 0; i < col; i++) {
            // 第i列，第零行
            char temp = chars[0][i];
            for (int j = 1; j < row; j++) {
                char cur = chars[j][i];
                if (cur < temp) {
                    ans++;
                    break;
                }
                temp = cur;
            }
        }

        return ans;
    }

}
