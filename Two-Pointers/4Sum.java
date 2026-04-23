class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();
        if(nums.length==4){
            long sum = (long)nums[0] + (long)nums[1] + (long)nums[2] + (long)nums[3];
            if(sum>Integer.MAX_VALUE || sum<Integer.MIN_VALUE) return answer;
            if(sum!=(long)target) return answer;
            else answer.add(Arrays.asList(nums[0],nums[1],nums[2],nums[3]));
            return answer;
        }
        if(nums.length<4) return answer;
        for(int i = 0 ; i < nums.length-2 ; i++){
            for(int j = i + 1 ; j < nums.length-1 ; j++){
                int left = j + 1;
                int right = nums.length - 1;
                while(left < right){
                    int current = nums[i] + nums[j] + nums[left] + nums[right];
                    if(current == target){
                        Arrays.asList(nums[i],nums[j],nums[left],nums[right]);
                        if(!answer.contains(Arrays.asList(nums[i],nums[j],nums[left],nums[right]))) answer.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        while(left<right && nums[left]==nums[left+1]) left++;
                        while(left<right && nums[right]==nums[right-1]) right--;
                        left++;
                        right--;
                    }else if(current < target){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return answer;
    }
}
