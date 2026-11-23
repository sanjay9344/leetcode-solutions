/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode curr = headA;
        ListNode temp = headB;
        while(curr != temp){
            curr = ( curr == null) ? headB : curr.next;
            temp = ( temp == null)? headA : temp.next;
        }
        return curr;
    }
}