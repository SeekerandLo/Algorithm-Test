package datastructure.array.moveZeroes;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * @author Liy
 * @date 2019/7/8
 **/

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int lastZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastZeroIndex] = nums[i];
                lastZeroIndex++;
            }
        }

        for (int i = lastZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }


}
