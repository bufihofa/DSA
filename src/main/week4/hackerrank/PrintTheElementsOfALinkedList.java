package main.week4.hackerrank;

public class PrintTheElementsOfALinkedList {
    static void printLinkedList(SinglyLinkedListNode head) {
        if(head != null){
            System.out.println(head.data);
            printLinkedList(head.next);
        }
    }
}
