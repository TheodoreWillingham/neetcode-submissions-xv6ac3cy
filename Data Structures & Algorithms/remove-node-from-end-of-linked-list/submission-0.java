/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pointer = head;
        ListNode prevPointer = head;
        int size = 1;
        //find LinkedList Size
        while (pointer.next != null) {
            prevPointer = pointer;
            pointer = pointer.next;
            size++;
        }

        //amount till at nth node from end
        int index = size - n;

        //at head case
        if (index == 0) {
            head = head.next;
        } else if (n == 0) {
            prevPointer.next = null;
        } else {
            //reset pointer
            pointer = head;
            prevPointer = head;
            //move pointer to removal point
            for (int i = 0; i < index; i++) {
                prevPointer = pointer; 
                pointer = pointer.next;
            }
            //perform removal
            prevPointer.next = pointer.next;
            
        }




        return head;
    }
}
