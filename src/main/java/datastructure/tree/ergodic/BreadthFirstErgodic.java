package datastructure.tree.ergodic;

import datastructure.tree.TreeNode;

import java.util.*;

/**
 * 广度优先遍历：对每一层的节点 访问完后 再访问下一层节点
 * <p>
 * 使用队列，首先将节点入队列，然后将这个节点的左右节点入队列，将队列首的节点出队列
 *
 * @author Liy
 * @date 2019/6/25
 **/

public class BreadthFirstErgodic {


    public List<Character> breadthFirstErgodic(TreeNode<Character> root){
        List<Character> characterList = new ArrayList<>();
        if(root == null){
            return null;
        }
        // LinkedList 是一个队列
        Queue<TreeNode> breadTreeNodeQueue = new LinkedList<>();
        breadTreeNodeQueue.offer(root);

        while (!breadTreeNodeQueue.isEmpty()){
            TreeNode head = breadTreeNodeQueue.poll();
            if(head.getLeft() != null){
                breadTreeNodeQueue.offer(head.getLeft());
            }
            if (head.getRight() != null){
                breadTreeNodeQueue.offer(head.getRight());
            }
            characterList.add((Character) head.getVal());
        }
        return characterList;
    }


}
