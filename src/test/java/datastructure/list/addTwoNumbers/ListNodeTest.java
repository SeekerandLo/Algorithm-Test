package datastructure.list.addTwoNumbers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
        node1.out();
    }

}