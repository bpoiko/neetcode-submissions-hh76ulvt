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
    public ListNode reverseList(ListNode head) {
        
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev; //cut the forward facing link
            prev = curr; // move prev along
            curr = temp; // keep traversing
        }
        return prev;
    }
}
