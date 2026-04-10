//Here the Key Greedy Idea is that you only need Minimum Price so Far and Maximum Profit because best Profit = sell at today's price - lowest price before today
//TC - O(n)
class Solution {
    public int maxProfit(int[] prices) {
       int min = Integer.MAX_VALUE;
       int max = 0;
       for(int price : prices){
        if(price < min){
            min = price;
        }else{
            max = Math.max(max,price-min);
        }
       }
    return max;      
    }
}
