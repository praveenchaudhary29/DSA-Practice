//Question - Leetcode(203 Easy)
//Here we have used simple two pointer method to remove all the nodes from the list where node.val == val and at the end return the head of modified list
class Solution {
    public ListNode removeElements(ListNode head, int val) {
      ListNode start = head;
      while(start != null &&  start.val == val){
        start = start.next;
      }
      if(start == null) return start;
      ListNode current  = start.next;
      ListNode prev = start;
      while(current != null){
        if(current.val == val){
            prev.next = current.next;
            current = current.next;
            if(current == null) break;
            continue;
        }
        prev = prev.next;
        current = current.next;
      }
    return start;   
    }
}
