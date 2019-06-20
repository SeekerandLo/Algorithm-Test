package datastructure.tree;

import org.junit.Before;
import org.junit.Test;

public class BinaryTreeTest {

    private BinaryTree<Integer> binaryTree;

    @Before
    public void init() {
        binaryTree = new BinaryTree<>();
    }

    @Test
    public void testAdd() {
        binaryTree.add(1);
    }

}