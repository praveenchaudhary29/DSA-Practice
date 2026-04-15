//Question - Leetcode (2487 Medium)
//Here we Use Increasing Monotonic Stack to store Next Greater Element and use that idea to build a New LinkedList with only the Nodes that have no nodes on the Right side that have a greater value than them
//IMPORTANT - This Approach use Extra Space, it can also be done in o(1) by first Reversing the List keep Max so far, Remove smaller Nodes and Reverse Again.
class Solution {
    public ListNode removeNodes(ListNode head) {
       
        ArrayList<Integer> nodes = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
           nodes.add(temp.val);
           temp = temp.next;
        }
        Integer [] list = nodes.toArray(new Integer[0]);
        int [] hasGreater = new int[list.length];
        Stack<Integer> stack = new Stack<>();
        Arrays.fill(hasGreater,-1);

        for(int i=0; i<list.length; i++){
           while(!stack.isEmpty() && list[stack.peek()] < list[i]){
               int topIndex = stack.pop();
               hasGreater[topIndex] = list[i];
            }
        stack.push(i);  
        }

        ListNode start = new ListNode(0);
        ListNode newHead = start;

        for(int i=0; i<hasGreater.length; i++){
            if(hasGreater[i] != -1)continue;
            ListNode current = new ListNode(list[i]);
            start.next = current;
            start = start.next;
        }
    return newHead.next;     
    }
}
