package datastructure.list.addTwoNumbers;

/**
 * data: 2019/6/17 14:31
 **/

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }


    public String out() {
        StringBuilder stringBuilder = new StringBuilder();
        ListNode curr = this;
        while (curr != null) {
            stringBuilder.append(curr.val);
            curr = curr.next;
        }
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
