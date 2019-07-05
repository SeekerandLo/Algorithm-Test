package datastructure.tree.isUnivalTree;

import datastructure.tree.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 如果二叉树每个节点都具有相同的值，那么该二叉树就是单值二叉树。
 * <p>
 * 只有给定的树是单值二叉树时，才返回 true；否则返回 false。
 *
 * @author Liy
 * @date 2019/6/28
 **/

public class IsUnivalTree {

    public boolean isUnivalTree(TreeNode<Integer> root) {
        int t = root.getVal();
        return helper(root, t);
    }

    private boolean helper(TreeNode<Integer> node, int t) {
        if (node.getVal() != t) {
            return false;
        }
        boolean left = helper(node.getLeft(), t);
        boolean right = helper(node.getRight(), t);

        return left && right;
    }

}
