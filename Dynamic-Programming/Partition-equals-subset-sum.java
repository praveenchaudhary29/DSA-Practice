//Question - Leetcode(416 Medium)
//Here we have to make memoization to ensure that question does not exceed time limit
//More Optimal solution will be to use 1D DP.
class Solution {
    public boolean canPartition(int[] nums) {
      int sum = 0;
      for(int num : nums){ 
        sum += num;
      }
      if(sum % 2 != 0)return false;
      Boolean dp[][] = new Boolean[nums.length][sum/2 + 1];
      return possible(nums,0,dp,sum/2);
    }

    public boolean possible(int [] nums, int i,Boolean [][] dp, int target){
        if(target == 0) return true;
        if(target < 0) return false;
        if(i == nums.length){
            return false;
        }
        if(dp[i][target] != null) return dp[i][target];
        boolean take = possible(nums,i+1,dp,target-nums[i]);
        boolean notTake = possible(nums,i+1,dp,target);
        return dp[i][target] = take || notTake;
    }
}
