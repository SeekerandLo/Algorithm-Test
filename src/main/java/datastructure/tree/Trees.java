package datastructure.tree;

import java.util.*;

/**
 * @author Liy
 * @date 2019/6/26
 **/

public class Trees {

    /**
     * 广度优先遍历
     */
    public static <E> List<E> breadthFirstOrder(TreeNode<E> root) {
        List<E> ansList = new ArrayList<>();
        if (root == null) {
            return null;
        }
        Queue<TreeNode<E>> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.offer(root);
        while (!treeNodeQueue.isEmpty()) {
            TreeNode<E> head = treeNodeQueue.poll();
            ansList.add(head.getVal());
            if (head.getLeft() != null) {
                treeNodeQueue.offer(head.getLeft());
            }
            if (head.getRight() != null) {
                treeNodeQueue.offer(head.getRight());
            }
        }
        return ansList;
    }

    public static <E> List<E> depthFirstOrder(TreeNode<E> root) {
        List<E> ansList = new ArrayList<>();
        if (root == null) {
            return null;
        }
        Stack<TreeNode<E>> treeNodeStack = new Stack<>();
        treeNodeStack.push(root);
        while (!treeNodeStack.empty()) {
            TreeNode<E> head = treeNodeStack.pop();
            if (head.getRight() != null) {
                treeNodeStack.push(head.getRight());
            }
            if (head.getLeft() != null) {
                treeNodeStack.push(head.getLeft());
            }
            ansList.add(head.getVal());
        }
        return ansList;
    }

    /**
     * 中序遍历
     */
    public static <E> List<E> inOrder(TreeNode<E> root) {
        if (root == null) {
            return null;
        }
        List<E> ansList = new ArrayList<>();
        Stack<TreeNode<E>> treeNodeStack = new Stack<>();

        TreeNode<E> node = root;

        while (node != null || !treeNodeStack.empty()) {
            if (node != null) {
                treeNodeStack.push(node);
                node = node.getLeft();
            } else {
                node = treeNodeStack.pop();
                ansList.add(node.getVal());
                node = node.getRight();
            }
        }
        return ansList;
    }

    /**
     * 数组是广度遍历的树的循序
     * <p>
     * 通过数组构建树
     */
    public static <E> TreeNode<E> getTreeRoot(E[] treeArray) {
        TreeNode<E> root = new TreeNode<>(treeArray[0]);

        List<TreeNode<E>> treeNodeList = new ArrayList<>();

//        for (int i = 0; i < treeArray.length; i++) {
//            TreeNode<E> treeNode = new TreeNode<>(treeArray[i]);
//            if (2 * i + 1 >= treeArray.length) {
//                treeNode.setLeft(null);
//                treeNode.setRight(null);
//            } else {
//                treeNode.setLeft(new TreeNode<>(treeArray[2 * i + 1]));
//                if (2 * i + 2 >= treeArray.length) {
//                    treeNode.setRight(null);
//                } else {
//                    treeNode.setRight(new TreeNode<>(treeArray[2 * i + 2]));
//                }
//            }
//            treeNodeList.add(treeNode);
//        }



        return root;
    }


}
