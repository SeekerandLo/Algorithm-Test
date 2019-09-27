package recursion.practise;

import datastructure.list.ListNode;

/**
 * 反转链表
 *
 * @author Liy
 * @date 2019/6/25
 **/

public class ReversalLinkedList {

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
