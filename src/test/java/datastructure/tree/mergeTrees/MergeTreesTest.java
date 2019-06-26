package datastructure.tree.mergeTrees;

import datastructure.tree.Tree;
import datastructure.tree.TreeNode;
import datastructure.tree.ergodic.BreadthFirstErgodic;
import javafx.scene.layout.BackgroundRepeat;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MergeTreesTest {

    MergeTrees mergeTrees;

    TreeNode<Integer> root1;

    TreeNode<Integer> root2;

    BreadthFirstErgodic breadthFirstErgodic;

    @Before
    public void init() {
        mergeTrees = new MergeTrees();
        breadthFirstErgodic = new BreadthFirstErgodic();
        root1 = new TreeNode<>(1);
        root2 = new TreeNode<>(2);
    }

    @Before
    public void buildTree1() {
        TreeNode<Integer> left2 = new TreeNode<>(3);
        TreeNode<Integer> right2 = new TreeNode<>(2);

        TreeNode<Integer> left3 = new TreeNode<>(5);

        left2.setLeft(left3);
        root1.setLeft(left2);
        root1.setRight(right2);
    }

    @Before
    public void buildTree2() {
        TreeNode<Integer> left2 = new TreeNode<>(1);
        TreeNode<Integer> right2 = new TreeNode<>(3);

        TreeNode<Integer> left3 = new TreeNode<>(4);
        TreeNode<Integer> right3 = new TreeNode<>(7);

        left2.setRight(left3);
        right2.setRight(right3);

        root2.setLeft(left2);
        root2.setRight(right2);
    }

    @Test
    public void mergeTree() {
        TreeNode<Integer> ans = mergeTrees.mergeTree(root1, root2);
        System.out.println(root1.breadthFirstErgodic(ans));
    }
}