//Question-Leetcode(1288 Medium)
//Here first sort the Intervals on the basis of start time in ascending order but if start time is same the sort them on the basis of descending End time
class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
      Arrays.sort(intervals,(a,b)-> {
        if(a[0]==b[0]) return Integer.compare(b[1],a[1]);
        return Integer.compare(a[0],b[0]);
      });
      int count = 1;
      int start = intervals[0][0];
      int currend = intervals[0][1];

      for(int i=1; i<intervals.length; i++){
        if(intervals[i][0]>=start && intervals[i][1] <= currend){
           continue;
        }else{
            count++;
            start = intervals[i][0];
            currend = intervals[i][1];
        }
      }
     return count;  
    }
}
