package datastructure.list.reverseLinkedList;

import datastructure.list.ListNode;

/**
 * @author Liy
 * @date 2019/7/11
 **/

public class ReverseList {

    /**
     * 递归法反转链表
     */
    public ListNode reverseLinkedList(ListNode header) {

        if (header == null || header.next == null) {
            return header;
        }

        ListNode reverse = reverseLinkedList(header.next);

        header.next.next = header;
        header.next = null;

        return reverse;
    }

}
