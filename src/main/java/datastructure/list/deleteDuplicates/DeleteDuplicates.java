package datastructure.list.deleteDuplicates;

import datastructure.list.ListNode;

/**
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * @author Liy
 * @date 2019/6/27
 **/

public class DeleteDuplicates {

    /**
     * 因为排好序了，所以相同的派在一起，设置一个临时的值，迭代链表，将值赋给临时值，每次先判断与临时值是否相等，相等
     * 则 curr.next = curr.next.next
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}
