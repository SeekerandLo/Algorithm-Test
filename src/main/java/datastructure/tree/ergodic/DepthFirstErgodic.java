package datastructure.tree.ergodic;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 深度优先遍历：对每一个可能的分支路径深入到不能深入为止，每个节点只能访问一次
 * <p>
 * 使用栈，栈是先进后出
 *
 * @author Liy
 * @date 2019/6/25
 **/

public class DepthFirstErgodic {

    static class TreeNode {
        char val;

        TreeNode left;

        TreeNode right;

        TreeNode(char val) {
            this.val = val;
        }
    }

    /**
     * 假设先走从左方向开始
     *
     * @param root 根节点
     * @return 结果
     */
    public ArrayList<Character> depthFirstErgodic(TreeNode root) {
        ArrayList<Character> characterList = new ArrayList<>();
        if (root == null) {
            return null;
        }

        Stack<TreeNode> treeNodeStack = new Stack<>();
        treeNodeStack.push(root);

        while (!treeNodeStack.empty()) {
            TreeNode stackHead = treeNodeStack.pop();
            if (stackHead.right != null) {
                treeNodeStack.push(stackHead.right);
            }

            if (stackHead.left != null) {
                treeNodeStack.push(stackHead.left);
            }



            characterList.add(stackHead.val);
        }

        return characterList;
    }


}
