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
        ListNode tracker = head;
        while(tracker != null){
            N++;
            tracker = tracker.next;
        }
        int index = N - n;

        if(index == 0){
            return head.next;
        }

        tracker = head;

        for(int i = 0; i < N; i++){
            if(i+1 == index){
                tracker.next = tracker.next.next;
                break;
            }
            tracker = tracker.next;
        }

        return head;
    }
}
