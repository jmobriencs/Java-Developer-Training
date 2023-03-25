package miscpractice.linkedlist;

/**
 * @author john-michael.obrien
 * @since 3/1/23
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}
