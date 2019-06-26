package math.isBoomerang;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

/**
 * 回旋镖定义为一组三个点，这些点各不相同且不在一条直线上。
 * <p>
 * 给出平面上三个点组成的列表，判断这些点是否可以构成回旋镖。
 *
 * @author Liy
 * @date 2019/6/24
 **/

public class IsBoomerang {

    /**
     * 首先各不相同
     * <p>
     * 不在同一直线上，计算斜率
     * <p>
     * 注意的问题：1. 斜率不存在的时候
     *              2. 如何判断几个数组不相等
     *              3. 精度问题
     *
     * @param points 点集
     * @return 是否是回旋镖
     */
    public boolean isBoomerang(int[][] points) {
        if (check(points)) {
            int[] point0 = points[0];
            int[] point1 = points[1];
            int[] point2 = points[2];

            String slope1 = calculateSlope(point0, point1);
            String slope2 = calculateSlope(point0, point2);

            return !slope1.equals(slope2);
        }
        return false;
    }

    private String calculateSlope(int[] point1, int[] point2) {
        if (point1[0] == point2[0]) {
            return "no slope";
        } else {
            // 防止 +0.0 和 -0.0
            double slope = (point2[1] - point1[1]) * 1.0 / (point2[0] - point1[0]) * 1.0 + 0.0;
            return String.valueOf(slope);
        }
    }


    private boolean check(int[][] points) {
        return !Arrays.equals(points[0], points[1]) && !Arrays.equals(points[0], points[2]) && !Arrays.equals(points[1], points[2]);
    }
}
