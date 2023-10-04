package main.week4.hackerrank;

public class InsertANodeAtTheTailOfALinkedList {
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode new_node = new SinglyLinkedListNode(data);
        if(head == null) return new_node;
        SinglyLinkedListNode current_node = head;
        while(current_node.next != null){
            current_node = current_node.next;
        }
        current_node.next = new_node;
        return head;

    }
}
