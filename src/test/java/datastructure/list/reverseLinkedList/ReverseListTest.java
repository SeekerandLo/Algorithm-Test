package datastructure.list.reverseLinkedList;

import datastructure.list.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseListTest {

    private ReverseList reverseList;
    private ListNode listNode = new ListNode(1);

    @Before
    public void init() {
        reverseList = new ReverseList();
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
    }

    @Test
    public void reverseLinkedList() {
        ListNode node = reverseList.reverseLinkedList(listNode);
        System.out.println(node.print());

    }
}