package datastructure.list;

/**
 * data: 2019/6/17 14:31
 **/

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }


    public String reverseOut() {
        StringBuilder stringBuilder = new StringBuilder();
        ListNode curr = this;
        while (curr != null) {
            stringBuilder.append(curr.val);
            curr = curr.next;
        }
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public String print() {
        StringBuilder stringBuilder = new StringBuilder();
        ListNode curr = this;
        while (curr != null) {
            stringBuilder.append(curr.val).append("-> ");
            curr = curr.next;
        }
        stringBuilder.append("NULL");
        return stringBuilder.toString();
    }
}
