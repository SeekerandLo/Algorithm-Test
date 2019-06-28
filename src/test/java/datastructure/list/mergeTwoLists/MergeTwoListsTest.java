package datastructure.list.mergeTwoLists;

import datastructure.list.ListNode;
import org.junit.Before;
import org.junit.Test;

public class MergeTwoListsTest {

    MergeTwoLists mergeTwoLists;

    ListNode root1 = new ListNode(1);

    ListNode root2 = new ListNode(1);

    @Before
    public void init() {
        mergeTwoLists = new MergeTwoLists();
        root1.next = new ListNode(2);
        root1.next.next = new ListNode(4);

        root2.next = new ListNode(3);
        root2.next.next = new ListNode(4);
    }

    @Test
    public void mergeTwoLists() {
        ListNode ans = mergeTwoLists.mergeTwoLists(root1,root2);
        System.out.println(ans.print());
    }
}