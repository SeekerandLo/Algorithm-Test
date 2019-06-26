package math.isRobotBounded;

/**
 * 在无限的平面上，机器人最初位于 (0, 0) 处，面朝北方。机器人可以接受下列三条指令之一：
 *
 * "G"：直走 1 个单位
 * "L"：左转 90 度
 * "R"：右转 90 度
 * 机器人按顺序执行指令 instructions，并一直重复它们。
 *
 * 只有在平面中存在环使得机器人永远无法离开时，返回 true。否则，返回 false。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/robot-bounded-in-circle
 *
 * @author Liy
 * @date 2019/6/24
 **/

public class IsRobotBounded {

    /**
     * 看的用户发的题解 https://leetcode-cn.com/problems/robot-bounded-in-circle/solution/si-kao-kao-zhi-xu-yao-yi-lun-xun-huan-ji-ke-de-chu/
     *
     * 判定为环的条件是 1. 最后方向不是原来的方向   2. 回到原点
     *
     * @param instructions 参数
     * @return 是否存在环
     */
    public boolean isRobotBounded(String instructions) {
        // 0上 1左 2下 3右
        int dir = 0;
        // x坐标
        int x = 0;
        // y坐标
        int y = 0;

        char c;
        for (int i = 0; i < instructions.length(); i++) {
            c = instructions.charAt(i);
            if (c == 'G') {
                switch (dir) {
                    case 0:
                        y++;
                        break;
                    case 1:
                        x--;
                        break;
                    case 2:
                        y--;
                        break;
                    case 3:
                        x++;
                        break;
                    default:
                        break;
                }
            }
            if (c == 'L') {
                if (dir == 3) {
                    dir = 0;
                } else {
                    dir++;
                }
            }
            if (c == 'R') {
                if (dir == 0) {
                    dir = 3;
                } else {
                    dir--;
                }
            }
        }

        if (x == 0 && y == 0) {
            return true;
        }
        return dir != 0;
    }

}
