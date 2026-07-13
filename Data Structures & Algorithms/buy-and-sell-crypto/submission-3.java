class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        for(int j=1;j<prices.length;j++){
            if(prices[j]<min){
                min = prices[j];
            }
            else{
                int prof = prices[j]-min;
                if(max < prof){
                max = prof;
                }
            }
        }
        
        return max;
    }
}
