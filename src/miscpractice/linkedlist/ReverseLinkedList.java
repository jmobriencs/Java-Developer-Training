package miscpractice.linkedlist;

/**
 * @author john-michael.obrien
 * @since 3/1/23
 */
public class ReverseLinkedList {
    public static void main(String[] args) {
        // create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // Print the original list
        printList(node1);

        // Reverse the linked list using two pointers
        ListNode reversed = reverseList(node1);

        // Print the reversed list
        printList(reversed);
    }

    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;
    }

    private static void printList(ListNode head) {
        // print the original linked list
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
