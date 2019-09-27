package swordfingerOffer.recursion.reverseLinkedList;

import datastructure.list.ListNode;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author Liy
 * @date 2019/7/16
 **/

public class ReverseList {

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
