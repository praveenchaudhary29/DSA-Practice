//Question - Leetcode(56 - Merge Intervals)
//Sort the Intervals by End, Keep track of start and End pointers and add (start,end) to result list when there is no overlapping and then change list to Array as Asked in the question to Return
class Solution {
    public int[][] merge(int[][] intervals) {
      Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
      ArrayList<int []> result = new ArrayList<>();
      int start = intervals[0][0];
      int currend = intervals[0][1];

      for(int i=1; i<intervals.length; i++){
        if(intervals[i][0] <= currend){
            currend = Math.max(currend,intervals[i][1]);
        }else{
            int[] arr = new int[2];
            arr[0] = start;
            arr[1] = currend;
            result.add(arr);
            start = intervals[i][0];
            currend = intervals[i][1];
        }
      }
    int [] arr = new int[2];
    arr[0] = start;
    arr[1] = currend;
    result.add(arr);  
    return result.toArray(new int[result.size()][]);  
    }
}
