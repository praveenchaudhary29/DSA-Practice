//Question - Leetcode(153 Medium)
//Here we have to use basic Binary search algorithm to find the minimum in a rotated sorted Array in logn time complexity
class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int min = Integer.MAX_VALUE;;
        while(start < end){
            int mid = start + (end-start)/2;
            min = Math.min(nums[mid],min);
            if(nums[mid] > nums[end]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
    return Math.min(nums[start],min);    
    }
}
