//Question - Leetcode(496 Easy)
//TC - O(n)
//Here we use Increasing Monotonic stack + Hashmap
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i = 0; i<nums2.length; i++){
         map.put(nums2[i],i);
       }

       int [] nextGreater = new int[nums2.length];
       Arrays.fill(nextGreater,-1);
       Stack<Integer> stack = new Stack<>();
       for(int i =0; i<nums2.length; i++){
        
        while( !stack.isEmpty() && nums2[stack.peek()] < nums2[i]){
            nextGreater[stack.pop()] = nums2[i];
        }
        stack.push(i);
       }
       int [] ans =new int[nums1.length];
       for(int i=0; i<nums1.length; i++){
        ans[i] = nextGreater[map.get(nums1[i])];
       } 
    return ans;      
    }
}
