package src;
/**
 * LinkedList
 */
class Main {

    public static void main(String[] args) {

        LinkedListFactory factory = new LinkedListFactory();
        LinkedListOperations operations = new LinkedListOperations();

        ListNode simpleLinkedList = factory.createLargeLinkedList();
        ListNode reversedList = operations.swapPairsRecursively(simpleLinkedList);

        LinkedListPrinter printer = new LinkedListPrinter();
        printer.printList(reversedList);
    }


}
