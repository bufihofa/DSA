package main.week4.hackerrank;

public class PrintInReverse {
    public static void reversePrint(SinglyLinkedListNode llist) {
        // Write your code here
        if(llist.next != null){
            reversePrint(llist.next);
        }
        System.out.println(llist.data);
    }
}
