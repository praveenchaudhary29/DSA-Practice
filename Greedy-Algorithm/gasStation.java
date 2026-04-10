//question - Gas Station (Leetcode 134 Medium)
//TC - O(n)
//if total cost > total gas then not possible to reach again at the same station circularly

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       int total = 0;
       int start = 0;
       int tank = 0;
       for(int i = 0; i<gas.length; i++){
        int diff = gas[i] - cost[i];
        total += diff;
        tank += diff;
         //if you fail at an index i then any station between previous start and i can not be a valid starting point hence skip to next 
        if(tank<0){
            start = i+1;
            tank=0;
        } 
       }
      return total>=0 ? start : -1;  
    }
}
