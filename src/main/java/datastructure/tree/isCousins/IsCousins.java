package datastructure.tree.isCousins;

import datastructure.tree.TreeNode;

import java.util.HashMap;

/**
 * 在二叉树中，根节点位于深度 0 处，每个深度为 k 的节点的子节点位于深度 k+1 处。
 * <p>
 * 如果二叉树的两个节点深度相同，但父节点不同，则它们是一对堂兄弟节点。
 * <p>
 * 我们给出了具有唯一值的二叉树的根节点 root，以及树中两个不同节点的值 x 和 y。
 * <p>
 * 只有与值 x 和 y 对应的节点是堂兄弟节点时，才返回 true。否则，返回 false。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/cousins-in-binary-tree
 *
 * @author Liy
 * @date 2019/6/26
 **/

public class IsCousins {

    HashMap<Integer, Integer> depth = new HashMap<>();
    HashMap<Integer, TreeNode<Integer>> parent = new HashMap<>();

    public boolean isCousins(TreeNode<Integer> root, int x, int y) {

        helper(root, null);
        return ((depth.get(x).equals(depth.get(y))) && (parent.get(x) != parent.get(y)));
    }


    private void helper(TreeNode<Integer> node, TreeNode<Integer> par) {
        if (node != null) {
            depth.put(node.getVal(), (par != null ? depth.get(par.getVal()) + 1 : 0));
            parent.put(node.getVal(), par);
            helper(node.getLeft(), node);
            helper(node.getRight(), node);
        }
    }
}
