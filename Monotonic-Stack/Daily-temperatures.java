//Question - Leetcode (739 Medium)
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] answer = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
               int topIndex = stack.pop();
               answer[topIndex] = i - topIndex;
            }
        stack.push(i);    
        }
    return answer;
    }
}
