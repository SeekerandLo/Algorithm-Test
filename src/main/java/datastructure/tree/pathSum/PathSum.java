package datastructure.tree.pathSum;

import datastructure.tree.TreeNode;

/**
 * 给定一个二叉树，它的每个结点都存放着一个整数值。
 * <p>
 * 找出路径和等于给定数值的路径总数。
 * <p>
 * 路径不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
 * <p>
 * 二叉树不超过1000个节点，且节点数值范围是 [-1000000,1000000] 的整数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/path-sum-iii
 *
 * @author Liy
 * @date 2019/6/26
 **/

public class PathSum {

    /**
     * 首先找到 叶子节点
     * <p>
     * if(当前节点得左右节点都是 null 则这是叶子节点)
     * <p>
     * 然后计算，结合位运算 会很简单，每一位都左移
     */

    private int ans = 0;

    public int pathSum(TreeNode<Integer> root) {
        helper(root, 0);
        return ans;
    }

    private void helper(TreeNode<Integer> root, int sum) {
        sum = sum << 1;
        sum = sum | root.getVal();
        if (root.getLeft() == null && root.getRight() == null) {
            ans = ans + sum;
            return;
        }

        helper(root.getLeft(), sum);
        helper(root.getRight(), sum);
    }

}
