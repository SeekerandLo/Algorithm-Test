package datastructure.tree;

/**
 * data: 2019/6/3 9:57
 **/

public class BinarySearchTree<E extends Comparable<E>> implements Tree<E> {

    private Node<E> root;

    private int size;

    private static class Node<E> {
        E val;
        Node<E> left;
        Node<E> right;

        Node(E val) {
            this.val = val;
            left = null;
            right = null;
        }
    }

    public BinarySearchTree() {

    }

    public BinarySearchTree(Node<E> root) {
        this.root = root;
        this.size = 0;
    }

    @Override
    public void destroy() {

    }

    @Override
    public void add(E e) {
        if (root == null) {
            root = new Node<>(e);
        } else {
            add(root, e);
        }
    }

    private Node<E> add(Node<E> node, E e) {
        if (node == null) {
            size++;
            return new Node<>(e);
        }

        if (e.compareTo(node.val) < 0) {
            node.left = add(node.left, e);
        } else if (e.compareTo(node.val) > 0) {
            node.right = add(node.right, e);
        }
        return node;
    }

    // 理解
    private void helpKnowAdd(Node<E> node, E e) {
        if (e.equals(node.val)) {
            return;
        } else if (e.compareTo(node.val) < 0 && node.left == null) {
            node.left = new Node<>(e);
            size++;
            return;
        } else if (e.compareTo(node.val) > 0 && node.right == null) {
            node.right = new Node<>(e);
            size++;
            return;
        }

        if (e.compareTo(node.val) < 0) {
            helpKnowAdd(node.left, e);
        } else {
            helpKnowAdd(node.right, e);
        }
    }

    @Override
    public boolean remove(E e) {
        return false;
    }

    @Override
    public E getRoot() {
        return null;
    }


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
