package datastructure.tree;

/**
 * 树应该提供得方法，广度优先遍历，深度优先遍历，返回 List
 *
 * 三种顺序遍历
 *
 * @author Liy
 * @date 2019/6/3 9:25
 **/

public class BinaryTree<E> implements Tree<E> {

    private int count = 0;

    private static class TreeNode<E> {
        E val;
        TreeNode<E> left;
        TreeNode<E> right;

        TreeNode(E val, TreeNode<E> left, TreeNode<E> right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public BinaryTree() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void add(E e) {
        TreeNode<E> newNode = new TreeNode<E>(e, null, null);


    }

    @Override
    public boolean remove(E e) {
        return false;
    }

    @Override
    public E getRoot() {
        return null;
    }

    private boolean compare(){

        return false;
    }
}
