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
        int N = 0;
        ListNode curr = head;
        while(curr != null){
            N++;
            curr = curr.next;
        }
        int removeAt = N - n;
        if(removeAt == 0){
            return head.next; // remove the first node
        }
        curr = head;
        for(int i = 0; i < N-1; i++){
            if((i+1) == removeAt){
                curr.next = curr.next.next;//skip that nth node
                break; //stop going..
            }
            curr = curr.next;
        }
        return head;
    }
}
