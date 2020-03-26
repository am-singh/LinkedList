package src;
/**
 * LinkedListUtilities
 */
public class LinkedListPrinter {

    public  void printReversedListRecursively(ListNode head) {
        if (head == null) {
            return;
        }
        printReversedListRecursively(head.next);
        System.out.println(head);
    }
    
    public  void printList(ListNode head) {
        while (head != null) {
            System.out.println(head);
            head = head.next;
        }
    }
}