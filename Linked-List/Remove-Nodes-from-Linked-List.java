//Question - Leetcode(2487 Medium)
//Here first Reverse the List then remove all the nodes that have a node with greater element on the left in reversed list by keeping track of max and after removal of all such nodes, again reverse the list
class Solution {
    public ListNode removeNodes(ListNode head) {
       head = reverse(head);
       int max = head.val;
       ListNode curr = head;
       while( curr.next != null){
        if(curr.next.val < max){
            curr.next = curr.next.next;
        }else{
            curr = curr.next;
            max = curr.val; 
        }
       
       } 
        return reverse(head); 
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
        }
    return prev;        
    }
}
