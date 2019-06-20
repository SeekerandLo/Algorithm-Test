package datastructure.tree;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeTest {
    BinarySearchTree<Integer> binaryTree = null;

    @Before
    public void init() {
        binaryTree = new BinarySearchTree<>();
    }


    @Test
    public void testAdd() {
        binaryTree.add(1);
    }
}