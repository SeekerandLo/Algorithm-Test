package datastructure.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Liy
 * @date 2019/6/25
 **/

public class TreeNode<E> {

    private E val;

    private TreeNode<E> left;
    private TreeNode<E> right;

    public TreeNode(E element) {
        this.val = element;
    }

    public E getVal() {
        return val;
    }

    public void setVal(E val) {
        this.val = val;
    }

    public TreeNode<E> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<E> left) {
        this.left = left;
    }

    public TreeNode<E> getRight() {
        return right;
    }

    public void setRight(TreeNode<E> right) {
        this.right = right;
    }

    /**
     * 广度优先遍历
     *
     * @param root
     * @return
     */
    public List<E> breadthFirstErgodic(TreeNode<E> root) {
        List<E> characterList = new ArrayList<>();
        if (root == null) {
            return null;
        }
        // LinkedList 是一个队列
        Queue<TreeNode> breadTreeNodeQueue = new LinkedList<>();
        breadTreeNodeQueue.offer(root);

        while (!breadTreeNodeQueue.isEmpty()) {
            TreeNode head = breadTreeNodeQueue.poll();
            if (head.getLeft() != null) {
                breadTreeNodeQueue.offer(head.getLeft());
            }
            if (head.getRight() != null) {
                breadTreeNodeQueue.offer(head.getRight());
            }
            characterList.add((E) head.getVal());
        }
        return characterList;
    }


    public void preErgodic(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getVal()+" ");
        preErgodic(root.getLeft());
        preErgodic(root.getRight());
    }



}
