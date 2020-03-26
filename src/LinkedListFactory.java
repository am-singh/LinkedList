package src;

/**
 * LinkedListFactory
 */
public class LinkedListFactory {

    public ListNode createSmallLinkList() {
        ListNode head = new ListNode(0);
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);

        head.next = first;
        first.next = second;
        second.next = null;

        return head;
    }

    public ListNode createLargeLinkedList() {
        ListNode head = new ListNode(0);
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;

        return head;
    }
}