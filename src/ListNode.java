package src;
/**
 * Node
 * 
 */
class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node {\n\tdata: " + data + "\n\thasNeighbour: " + (next != null) +"\n     }";
    }
}