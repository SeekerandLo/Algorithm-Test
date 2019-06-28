package datastructure.list.deleteDuplicates;

import datastructure.list.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeleteDuplicatesTest {

    DeleteDuplicates deleteDuplicates;
    ListNode listNode = new ListNode(1);

    @Before
    public void init() {
        deleteDuplicates = new DeleteDuplicates();
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(1);
    }


    @Test
    public void deleteDuplicates() {

        ListNode ans = deleteDuplicates.deleteDuplicates(listNode);
        System.out.println(ans.print());
    }


    class testClass {
        int val;

        public testClass(int val) {
            this.val = val;
        }
    }

    @Test
    public void test_class_modify(){
        testClass testClass = new testClass(1);
        testClass testClass2 = testClass;
        testClass2.val = 2;
        System.out.println(testClass.val);
    }

}