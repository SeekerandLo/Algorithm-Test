package datastructure.tree.ergodic;

import datastructure.tree.TreeNode;
import datastructure.tree.Trees;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class BreadthFirstErgodicTest {

    BreadthFirstErgodic breadthFirstErgodic;

    TreeNode<Character> root;

    @Before
    public void init() {
        breadthFirstErgodic = new BreadthFirstErgodic();
        root = new TreeNode<>('A');

    }

    @Before
    public void buildTree() {
        TreeNode<Character> left2 = new TreeNode<>('B');
        TreeNode<Character> right2 = new TreeNode<>('C');

        TreeNode<Character> left3 = new TreeNode<>('D');
        TreeNode<Character> right3 = new TreeNode<>('E');

        left2.setLeft(left3);
        left2.setRight(right3);

        root.setLeft(left2);
        root.setRight(right2);
    }


    @Test
    public void breadthFirstErgodic() {


        List<Character> actual = Trees.inOrder(root);


        System.out.println(actual);


    }
}