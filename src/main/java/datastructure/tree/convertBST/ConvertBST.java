package datastructure.tree.convertBST;

import datastructure.tree.Tree;
import datastructure.tree.TreeNode;

/**
 * @author Liy
 * @date 2019/6/26
 **/

public class ConvertBST {

    /**
     * if(root == null)
     * return;
     * unPreOrder(root.right);
     * root.val += preNum;
     * preNum = root.val;
     * unPreOrder(root.left);
     *
     * @param root
     * @return
     */

    int preNum = 0;

    public TreeNode<Integer> convertBst(TreeNode<Integer> root) {
        if (root == null) {
            return null;
        }


        return null;
    }

    private void unPreOrder(TreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        unPreOrder(root.getRight());
        root.setVal(preNum + root.getVal());
        preNum = root.getVal();
        unPreOrder(root.getLeft());
    }


}
