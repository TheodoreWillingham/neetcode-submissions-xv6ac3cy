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
    public boolean hasCycle(ListNode head) {
        // I will go about this with hare and turtle solution
        ListNode hare = head.next;
        ListNode turtle = head;

        while (hare != null && turtle != null) {
            if (hare == turtle) {
                return true;
            }
            hare = hare.next;
            if (hare == null) return false;
            hare = hare.next;
            turtle = turtle.next;
        }

        return false;
    }
}
