package src;
/**
 * LinkedList
 */
class Main {

    public static void main(String[] args) {

        LinkedListFactory factory = new LinkedListFactory();
        LinkedListOperations operations = new LinkedListOperations();

        ListNode largeLinkedList = factory.createLargeLinkedList();
        ListNode reversedList = operations.swapPairsRecursively(largeLinkedList);

        LinkedListPrinter printer = new LinkedListPrinter();

        ListNode smallLinkedList = factory.createSmallLinkList();
        ListNode mergedList = operations.mergeLists(smallLinkedList, largeLinkedList);
        printer.printListLinear(mergedList);
    }


}
