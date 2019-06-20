package datastructure.tree;

/**
 * data: 2019/6/3 9:25
 **/

public class BinaryTree<E> implements Tree<E> {

    private int count = 0;


    private static class Node<E> {
        E val;
        Node<E> left;
        Node<E> right;

        Node(E val, Node<E> left, Node<E> right) {
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
        Node<E> newNode = new Node<E>(e, null, null);


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
