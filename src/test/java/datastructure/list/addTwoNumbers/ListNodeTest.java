package datastructure.list.addTwoNumbers;

import datastructure.list.ListNode;
import org.junit.Before;
import org.junit.Test;

public class ListNodeTest {

    private ListNode node1;


    @Before
    public void creatNode(){
        // 323
        node1 = new ListNode(4);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(3);
    }

    @Test
    public void out() {
        node1.reverseOut();
    }

}