package recursion.practise;

/**
 * 计算 斐波那契数列
 * 1、1、2、3、5、8、13、21、34.
 *
 * @author Liy
 * @date 2019/6/25
 **/

public class Fibonacci {

    private static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }

}
