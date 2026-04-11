//Question-Best time to buy and Sell Stock 2(Leetcode-122 Medium)
class Solution {
    public int maxProfit(int[] prices) {
        int total = 0;
        int start = prices[0];
        for(int i=1; i<prices.length; i++){
            int end = prices[i];
            if(end>=start){
                total += (end-start);
            }
         start = end;   
        }
    return total;    
    }
}  
