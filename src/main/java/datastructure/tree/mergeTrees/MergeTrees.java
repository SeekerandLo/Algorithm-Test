package datastructure.tree.mergeTrees;


import datastructure.tree.TreeNode;

/**
 * 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
 *
 * 你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-binary-trees*
 *
 * @author Liy
 * @date 2019/6/25
 **/

public class MergeTrees {



    public TreeNode<Integer> mergeTree(TreeNode<Integer> t1, TreeNode<Integer> t2) {

        if (t1 == null && t2 == null) {
            return null;
        }

        TreeNode<Integer> root = new TreeNode<>((t1 == null ? 0 : t1.getVal()) + (t2 == null ? 0 : t2.getVal()));

        root.setLeft(mergeTree((t1 == null ? null : t1.getLeft()), (t2 == null ? null : t2.getLeft())));
        root.setRight(mergeTree((t1 == null ? null : t1.getRight()), (t2 == null ? null : t2.getRight())));

        return root;
    }


}
