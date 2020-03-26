# LinkedList

This project contains a couple basic operations and methods to get a hang of basic datatypes and algorithms.

## Quick Guide
### Printing
**Example 1:** Creating a linked list and printing it:
```java
    public static void main(String[] args) {
        Factory factory = new Factory();

        Node simpleLinkedList = factory.createSimpleLinkedList();
        Printer printer = new Printer();
        printer.printList(simpleLinkedList);
        printer.printReversedListRecursively(simpleLinkedList);
    }
``` 
### Operations
**Example 2:** Reversing a linked list:
```java
    public static void main(String[] args) {
        LinkedListFactory factory = new LinkedListFactory();
        LinkedListOperations operations = new LinkedListOperations();

        ListNode simpleLinkedList = factory.createSimpleLinkedList();
        ListNode reversedList = operations.reverseListIteratively(simpleLinkedList);

        LinkedListPrinter printer = new LinkedListPrinter();
        printer.printList(reversedList);
    }
```