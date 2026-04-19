//Question - Leetcode(2089 Easy)
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
       Arrays.sort(nums);
       List<Integer> list = new ArrayList<>();
        int start = 0;
        int end = nums.length-1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target)break;
            if(nums[mid]>target) end = mid-1;
            else start = mid+1;
        }
        for(int i =start ; i<= end; i++){
            if(nums[i] == target) list.add(i);
        }
    return list;    
    }
}
