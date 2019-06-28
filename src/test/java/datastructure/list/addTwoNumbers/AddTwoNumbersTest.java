package datastructure.list.addTwoNumbers;

import datastructure.list.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddTwoNumbersTest {

    private ListNode node1;
    private ListNode node2;

    private ListNode result;

    private AddTwoNumbers addTwoNumbers;

    @Before
    public void createListNodeTest() {
        // 323
//        node1 = new ListNode(3);
//        node1.next = new ListNode(2);
//        node1.next.next = new ListNode(3);
//
//        // 212
//        node2 = new ListNode(2);
//        node2.next = new ListNode(1);
//        node2.next.next = new ListNode(2);
//
//        result = new ListNode(5);
//        result.next = new ListNode(3);
//        result.next.next = new ListNode(5);

        addTwoNumbers = new AddTwoNumbers();

    }


//    @Test
//    public void addTwoNumbersTest() {
//        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
//        ListNode actual = addTwoNumbers.addTwoNumbers(node1, node2);
//
//    }

    @Test
    public void when_one_longerThan_other() {
        // 10  210
        ListNode node1 = new ListNode(0);
        node1.next = new ListNode(1);

        ListNode node2 = new ListNode(0);
        node2.next = new ListNode(1);
        node2.next.next = new ListNode(2);

        String actual = addTwoNumbers.addTwoNumbers(node1, node2).reverseOut();
        String expect = "220";

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void when_one_empty() {
        ListNode node1 = new ListNode(0);
        node1.next = new ListNode(1);

        String actual = addTwoNumbers.addTwoNumbers(node1, null).reverseOut();
        String expect = "10";

        Assert.assertEquals(expect, actual);
    }

    @Test
    public void when_additional() {
        ListNode node1 = new ListNode(9);
        node1.next = new ListNode(9);

        ListNode node2 = new ListNode(1);

        String actual = addTwoNumbers.addTwoNumbers(node1, node2).reverseOut();
        String expect = "100";

        Assert.assertEquals(expect, actual);
    }

}