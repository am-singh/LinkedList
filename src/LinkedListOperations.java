package src;

/**
 * LinkedListBasicOperations
 */
public class LinkedListOperations {

    ListNode mergeLists(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);
        ListNode newList = prehead;

        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                newList.next = l1;
                l1 = l1.next;
            } else {
                newList.next = l2;
                l2 = l2.next;
            }
            newList = newList.next;
        }
        newList.next = l1 == null? l2: l1;
        return prehead.next;
    }

    /**
     * Time complexity : O(n) - length of list<br>
     * Space complexity: O(n) - extra space for the stack
     * 
     * @param head head of list
     * @return reversed linked list
     */
    ListNode reverseRecursively(ListNode head) {
        // exit condition (base case)
        if (head == null || head.next == null) {
            return head;
        }

        // traversing to the end of the list
        ListNode p = reverseRecursively(head.next);

        // pointer manipulation
        // think of the stack, we take the element at the top and
        // manipulate its neighbours next pointer to point backwards
        head.next.next = head;
        head.next = null;
        return p;
    }

    /**
     * Time complexity : O(n) - length of list<br>
     * Space complexity: O(1) - no extra space necessary
     * 
     * @param head head of list
     * @return reversed linked list
     */
    ListNode reverseListIteratively(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    /**
     * Time complexity : O(n) - length of list<br>
     * Space complexity: O(n) - extra space for the stack
     * 
     * @param head head of list
     * @return linked list with swapped pairs
     */
    ListNode swapPairsRecursively(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Nodes to be swapped
        ListNode firstNode = head;
        ListNode secondNode = head.next;

        // Swapping
        firstNode.next = swapPairsRecursively(secondNode.next);
        secondNode.next = firstNode;

        return secondNode;
    }

    /**
     * Time complexity : O(n) - length of list<br>
     * Space complexity: O(n) - extra space for the stack
     * 
     * @param head head of list
     * @return linked list with swapped pairs
     */
    ListNode swapPairsIteratively(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;

        while (head != null && head.next != null) {
            // define elements to be swapped
            ListNode firstNode = head;
            ListNode secondNode = head.next;

            // swap elements
            prev.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;

            // re-initialize jumping elements
            prev = firstNode; // reinit prev, since it changed now
            head = firstNode.next; // head has to be moved as well, for while condition
        }
        return dummy.next;
    }
}