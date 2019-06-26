package datastructure.tree.ergodic;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DepthFirstErgodicTest {

    DepthFirstErgodic depthFirstErgodic;
    DepthFirstErgodic.TreeNode root = new DepthFirstErgodic.TreeNode('A');


    @Before
    public void init() {
        depthFirstErgodic = new DepthFirstErgodic();
    }

    @Before
    public void buildTree() {
        DepthFirstErgodic.TreeNode left2 = new DepthFirstErgodic.TreeNode('B');
        DepthFirstErgodic.TreeNode right2 = new DepthFirstErgodic.TreeNode('C');

        DepthFirstErgodic.TreeNode left3 = new DepthFirstErgodic.TreeNode('D');
        DepthFirstErgodic.TreeNode right3 = new DepthFirstErgodic.TreeNode('E');

        left2.left = left3;
        left2.right = right3;

        root.left = left2;
        root.right = right2;
    }

    @Test
    public void depthFirstErgodic() {
        ArrayList<Character> characters = depthFirstErgodic.depthFirstErgodic(root);
        System.out.println(characters);
    }
}