package greedy.lemonadeChange;

/**
 * 在柠檬水摊上，每一杯柠檬水的售价为 5 美元。
 * <p>
 * 顾客排队购买你的产品，（按账单 bills 支付的顺序）一次购买一杯。
 * <p>
 * 每位顾客只买一杯柠檬水，然后向你付 5 美元、10 美元或 20 美元。你必须给每个顾客正确找零，也就是说净交易是每位顾客向你支付 5 美元。
 * <p>
 * 注意，一开始你手头没有任何零钱。
 * <p>
 * 如果你能给每位顾客正确找零，返回 true ，否则返回 false 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/lemonade-change
 *
 * @author Liy
 * @date 2019/6/29
 **/

public class LemonadeChange {

    /**
     * int count = 收到的5美元的次数
     * <p>
     * 遍历数组，bills[i]/5 - 1 是需要找回的5美元的数量，count--
     * <p>
     */
    public boolean lemonadeChange(int[] bills) {
        int fivCount = 0;
        int tenCount = 0;
        for (int bill : bills) {
            if (bill == 5) {
                fivCount++;
            } else if (bill == 10) {
                fivCount--;
                if (fivCount < 0) {
                    return false;
                }
                tenCount++;
            } else {
                if (fivCount > 0 && tenCount > 0) {
                    fivCount--;
                    tenCount--;
                } else if (fivCount >= 3) {
                    fivCount -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}
