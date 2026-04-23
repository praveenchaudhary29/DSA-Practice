//Question - Leetcode(11 Medium)
class Solution {
    public int maxArea(int[] height) {
   int first = 0;
   int second = height.length-1;
   int max=0;
   while(first<second){
    int minim = minimum(first,second,height);
    if(height[minim]*(second-first)>max){
        max=height[minim]*(second-first);
    }
    if(height[first]>height[second]){
        second--;
    }else{
        first++;
    }
   }
   return max;

    }
    
   public static int minimum(int first, int second , int[] height){
    if(height[first]>height[second]){
        return second;
    }
    return first;
   } 
}
