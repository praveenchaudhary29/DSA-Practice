//Question - Leetcode(1019 Medium)
//Use Increasing Monotonic Stack to Find next Greater Node in Linked List.
class Solution {
    public int[] nextLargerNodes(ListNode head) {
       ListNode temp =head;
       int size = 0;
       ArrayList<Integer> list = new ArrayList<>();
       while(temp != null){
        list.add(temp.val);
        temp = temp.next;
        size++;
       }
       Integer [] linked = list.toArray(new Integer[0]);
       int [] answer = new int[size];
       Arrays.fill(answer,0);

       Stack<Integer> stack = new Stack<>();

       for(int i=0; i<linked.length; i++){

        while(!stack.isEmpty() && linked[stack.peek()] < linked[i]){
            answer[stack.pop()] = linked[i];
        }
        stack.push(i);
       }
       
       

    return answer;
    }
}
