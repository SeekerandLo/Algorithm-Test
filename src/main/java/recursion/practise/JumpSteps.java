package recursion.practise;

/**
 * 小青蛙 跳台阶，每次要么跳1个  要么跳两个
 * 跳到 n 阶 问，一共有多少种跳法
 *
 * @author Liy
 * @date 2019/6/25
 **/

public class JumpSteps {

    private static int jumpSteps(int n) {
        if (n <= 2) {
            return n;
        }
        int result;
        result = jumpSteps(n - 1) + jumpSteps(n - 2);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(jumpSteps(3));
    }

}
