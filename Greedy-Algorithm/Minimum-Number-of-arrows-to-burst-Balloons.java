//Question - Leetcode(452 Medium)
//TC - O(n)
//Idea -Shoot the balloon at the earliest Possible End so in that way you can cover maximum Overlapping Balloons
class Solution {
    public int findMinArrowShots(int[][] points) {
       Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
       int result = 1;
       int lastend = points[0][1];
       for(int i = 1; i<points.length; i++){
         if(points[i][0]<=lastend){
             continue;
         }else{
            result++;
            lastend = points[i][1];
         }
       } 
    return result;   
    }
}
