//Question - Leetcode(503 Medium)
//Same as Next Greater Element 1, but here we run the loop upto twice the length of given Array so as to cover circular Condition.
class Solution {
    public int[] nextGreaterElements(int[] nums) {
       int [] ans = new int[nums.length];
       Arrays.fill(ans,-1);
       Stack<Integer> stack = new Stack();

       for(int i=0; i<2*nums.length; i++){
        while(!stack.isEmpty() && nums[stack.peek()] < nums[i%nums.length]){
            ans[stack.pop()] = nums[i%nums.length];
        }
        stack.push( i%nums.length);
       }
    return ans;
    }
}
