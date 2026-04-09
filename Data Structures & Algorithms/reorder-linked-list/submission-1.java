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
    public void reorderList(ListNode head) {
        ListNode front = head;
        ListNode end = head;
        ListNode tempEnd = head;
        
        while (true) {
            //get to end of linkedList (track end and prevEnd)
            while (end.next != null) {
                tempEnd = end;
                end = end.next;
            }
            
            //severEnd Node & insert infront of front
            tempEnd.next = null;
            ListNode temp = front.next;
            front.next = end;
            end.next = temp;

            //skip one node
            front = temp;
            end = front;

            //when you reach the end
            if (end == null) break;
            if (tempEnd == temp) break;

        }
    }
}
