package main.week4.hackerrank;

public class Merge {
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode head = new SinglyLinkedListNode(0);
        SinglyLinkedListNode pos = head;
        while(head1 != null && head2 != null){
            if(head1.data < head2.data){
                pos.next = new SinglyLinkedListNode(head1.data);
                pos = pos.next;
                head1 = head1.next;
            }
            else{
                pos.next = new SinglyLinkedListNode(head2.data);
                pos = pos.next;
                head2 = head2.next;
            }
        }
        while(head1 != null){
            pos.next = new SinglyLinkedListNode(head1.data);
            pos = pos.next;
            head1 = head1.next;
        }
        while(head2 != null){
            pos.next = new SinglyLinkedListNode(head2.data);
            pos = pos.next;
            head2 = head2.next;
        }
        head = head.next;
        return head;

    }
}
