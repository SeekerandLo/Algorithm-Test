package datastructure.list.oddEvenList;

import datastructure.list.ListNode;

/**
 * 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
 * <p>
 * 请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/odd-even-linked-list
 *
 * @author Liy
 * @date 2019/7/6
 **/

public class OddEvenList {

    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode oddIndex = head;
        ListNode evenIndex = head.next;
        ListNode evenHead = evenIndex;
        while (evenIndex != null && evenIndex.next != null) {
            oddIndex.next = evenIndex.next;
            oddIndex = oddIndex.next;

            evenIndex.next = oddIndex.next;
            evenIndex = evenIndex.next;
        }

        oddIndex.next = evenHead;
        return head;
    }

}
