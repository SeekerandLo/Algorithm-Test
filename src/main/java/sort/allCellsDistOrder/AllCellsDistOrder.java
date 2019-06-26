package sort.allCellsDistOrder;

import java.util.*;
import java.util.regex.Matcher;

/**
 * 给出 R 行 C 列的矩阵，其中的单元格的整数坐标为 (r, c)，满足 0 <= r < R 且 0 <= c < C。
 * <p>
 * 另外，我们在该矩阵中给出了一个坐标为 (r0, c0) 的单元格。
 * <p>
 * 返回矩阵中的所有单元格的坐标，并按到 (r0, c0) 的距离从最小到最大的顺序排，其中，两单元格(r1, c1) 和 (r2, c2) 之间的距离是曼哈顿距离，|r1 - r2| + |c1 - c2|。（你可以按任何满足此条件的顺序返回答案。）
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/matrix-cells-in-distance-order
 *
 * @author Liy
 * @date 2019/6/24
 **/

public class AllCellsDistOrder {

    /**
     * 首先构建一个二维数组，也不是数组，就是坐标，要有一个计算距离的函数
     * <p>
     * 结果是一个 [r*c][2] 的数组
     *
     * @param r  行
     * @param c  列
     * @param r0 目标行
     * @param c0 目标列
     * @return 距离数组
     */
    public int[][] allCellsDistOrder(int r, int c, int r0, int c0) {
        int[][] ans = new int[r * c][2];

        int index = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                // 每个点 到 目标点 都有有一个距离
                int[] disArray = new int[]{i, j};
                ans[index++] = disArray;
            }
        }

        Arrays.sort(ans, (int[] a, int[] b) -> {
            return Math.abs(a[0] - r0) + Math.abs(a[1] - c0) - Math.abs(b[0] - r0) - Math.abs(b[1] - c0);
        });


        return ans;
    }

}
