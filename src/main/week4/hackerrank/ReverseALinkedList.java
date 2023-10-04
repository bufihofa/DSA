package main.week4.hackerrank;

public class ReverseALinkedList {
    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        // Write your code here
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode center = llist;
        SinglyLinkedListNode after = null;

        while (center.next != null) {
            after = center.next;
            center.next = prev;
            prev = center;
            center = after;
        }

        center.next = prev;

        return center;

    }
}
