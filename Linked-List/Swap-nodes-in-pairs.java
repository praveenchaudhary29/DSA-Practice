//Question - Leetcode(24 Medium)
//Iterate the list in pairs and  swap them (without modifying the value in List Nodes) and return the start node 
class Solution {
    public ListNode swapPairs(ListNode head) {
       
       if(head == null || head.next == null) return head;

       ListNode first = head;
       ListNode second = head.next;
       ListNode prev = new ListNode(0);

       ListNode start = second;

       while(first != null && second != null){
           first.next = second.next;
           second.next = first;
           prev.next = second;
           prev = first;
           first = first.next;
           if(first==null) break;
           second = first.next;
       }
    return start;    
    }
}
