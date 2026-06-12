class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedListRecursive {

    // Recursive method to reverse the linked list
    public static Node reverseList(Node head) {
        // Base case: empty list or single node
        if (head == null || head.next == null) {
            return head;
        }

        // Recursively reverse the rest of the list
        Node newHead = reverseList(head.next);

        // Reverse the current node's link
        head.next.next = head;
        head.next = null;

        // Return the new head of the reversed list
        return newHead;
    }

    // Utility method to print the list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    // Utility method to append nodes
    public static Node append(Node head, int data) {
        if (head == null) {
            return new Node(data);
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        return head;
    }

    // Main method with example
    public static void main(String[] args) {
        Node head = null;

        // Creating the linked list: 1 -> 2 -> 3 -> 4
        head = append(head, 1);
        head = append(head, 2);
        head = append(head, 3);
        head = append(head, 4);

        System.out.println("Original Linked List:");
        printList(head);

        // Reverse the linked list recursively
        head = reverseList(head);

        System.out.println("Reversed Linked List:");
        printList(head);
    }
}