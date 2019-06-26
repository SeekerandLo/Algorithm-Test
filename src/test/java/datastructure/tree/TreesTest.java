package datastructure.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class TreesTest {


    @Test
    public void breadthFirstOrder() {
        TreeNode<Integer> a = new TreeNode<>(1);

        System.out.println(Trees.breadthFirstOrder(a));
    }

    @Test
    public void getTreeRoot() {

        Integer[] arr = {1, 2, 3, null, 4};
        Trees.getTreeRoot(arr);
    }
}