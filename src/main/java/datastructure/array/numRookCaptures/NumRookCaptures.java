package datastructure.array.numRookCaptures;

/**
 * 在一个 8 x 8 的棋盘上，有一个白色车（rook）。也可能有空方块，白色的象（bishop）和黑色的卒（pawn）。它们分别以字符 “R”，“.”，“B” 和 “p” 给出。大写字符表示白棋，小写字符表示黑棋。
 * <p>
 * 车按国际象棋中的规则移动：它选择四个基本方向中的一个（北，东，西和南），然后朝那个方向移动，直到它选择停止、到达棋盘的边缘或移动到同一方格来捕获该方格上颜色相反的卒。另外，车不能与其他友方（白色）象进入同一个方格。
 * <p>
 * 返回车能够在一次移动中捕获到的卒的数量。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/available-captures-for-rook
 *
 * @author Liy
 * @date 2019/6/28
 **/

public class NumRookCaptures {

    /**
     * 8*8
     * <p>
     * 遍历
     * <p>
     * 从当前点开始寻找，车。然后从四个方向开始寻找，如果碰到了象 break 。
     * 如果碰到了兵 ans++，再break
     */
    public int numRookCaptures(char[][] board) {
        int ans = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    for (int n = i; n >= 0; n--) {
                        if (board[n][j] == 'B') {
                            break;
                        }
                        if (board[n][j] == 'p') {
                            ans++;
                            break;
                        }
                    }

                    for (int s = i; s < 8; s++) {
                        if (board[s][j] == 'B') {
                            break;
                        }
                        if (board[s][j] == 'p') {
                            ans++;
                            break;
                        }
                    }

                    for (int w = j; w >= 0; w--) {
                        if (board[i][w] == 'B') {
                            break;
                        }
                        if (board[i][w] == 'p') {
                            ans++;
                            break;
                        }
                    }

                    for (int e = j; e < 8; e++) {
                        if (board[i][e] == 'B') {
                            break;
                        }
                        if (board[i][e] == 'p') {
                            ans++;
                            break;
                        }
                    }
                }
            }
        }

        return ans;
    }

}
