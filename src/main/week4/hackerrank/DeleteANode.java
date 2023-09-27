package main.week4.hackerrank;

public class DeleteANode {
    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        // Write your code here
        if(position == 0){
            llist = llist.next;
            return llist;
        }
        else{
            SinglyLinkedListNode current_node = llist;
            int index = 1;
            while(index < position){
                index++;
                current_node = current_node.next;
            }
            current_node.next = current_node.next.next;
            return llist;
        }
    }

}
