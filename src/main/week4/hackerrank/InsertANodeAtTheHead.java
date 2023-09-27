package main.week4.hackerrank;

public class InsertANodeAtTheHead {
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode header = new SinglyLinkedListNode(data);
        header.next = llist;
        return header;
    }
}
