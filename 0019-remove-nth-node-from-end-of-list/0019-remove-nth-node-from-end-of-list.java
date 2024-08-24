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
        int size = 0;
if(head.next == null){
    return null;

}
//size of the list
ListNode curr = head;
while(curr !=null){
    curr = curr.next;
    size++;
}
if(n == size){
    return head.next;
}
int indextoSearch = size - n;
int i = 1;
ListNode prev = head;
while(i< indextoSearch){
prev = prev.next;
i++;
}
prev.next = prev.next.next;
  return head;
    }
  
}