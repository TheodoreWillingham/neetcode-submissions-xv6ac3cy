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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode head; // tracks the sorted list
        ListNode pointer; // tracks where to add the sorted nodes

        if (list1.val <= list2.val) { //if list1 has lower starting val
            head = list1;
            pointer = list1;
            list1 = list1.next;
        } else {
            head = list2;
            pointer = list2;
            list2 = list2.next;
        }

        while (list1 != null && list2 != null) { //go until reach end of one list
            if (list1.val <= list2.val) {
                pointer.next = list1;
                pointer = pointer.next;
                list1 = list1.next;
            } else {
                pointer.next = list2;
                pointer = pointer.next;
                list2 = list2.next;
            }
        }

        if (list1 == null) {
            pointer.next = list2;
        } else {
            pointer.next = list1;
        }


        return head;

    }
}