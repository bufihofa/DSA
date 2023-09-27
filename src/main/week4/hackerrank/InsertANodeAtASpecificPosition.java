package main.week4.hackerrank;

public class InsertANodeAtASpecificPosition {
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        SinglyLinkedListNode newnode = new SinglyLinkedListNode(data);
        if(position == 0){
            newnode.next = llist;
            return newnode;
        }
        else{
            int index = 1;
            SinglyLinkedListNode tempnode = llist;
            while(index < position){
                index++;
                tempnode = tempnode.next;
            }
            SinglyLinkedListNode temp2node = tempnode.next;
            tempnode.next = newnode;
            newnode.next = temp2node;
            return llist;
        }
    }
}
