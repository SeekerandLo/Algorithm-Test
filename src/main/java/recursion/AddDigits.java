package recursion;

/**
 * @author Liy
 * @date 2019/6/3 10:12
 **/

public class AddDigits {

    // 递归
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int numNew = 0;
        while (num != 0) {
            numNew += num % 10;
            num /= 10;
        }
        return addDigits(numNew);
    }


    // Advanced:进阶


}

