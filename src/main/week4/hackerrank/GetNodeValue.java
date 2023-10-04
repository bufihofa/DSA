package main.week4.hackerrank;

public class GetNodeValue {
    public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
        // Write your code here
        int l = 0;
        SinglyLinkedListNode tmp = llist;
        while (tmp != null) {
            tmp = tmp.next;
            l++;
        }
        int pos = l - positionFromTail;
        while(pos>1){
            pos--;
            llist = llist.next;
        }
        int res = llist.data;
        return res;

    }
}
