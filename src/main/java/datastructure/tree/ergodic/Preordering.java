package datastructure.tree.ergodic;

import datastructure.tree.Tree;
import datastructure.tree.TreeNode;

/**
 * 先序遍历 ： 根左右
 *
 * @author Liy
 * @date 2019/6/25
 **/

public class Preordering {

    public TreeNode<Character> pre(TreeNode<Character> root) {
        if (root == null) {
            return null;
        }
        System.out.println(root.getVal());
        pre(root.getLeft());
        pre(root.getRight());
        return null;
    }


}
