class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int max = 0;
        for(int j=1;j<prices.length;j++){
            if(prices[i]<prices[j]){
                int prof = prices[j] - prices[i];
                if(max < prof){
                    max = prof;
                }
            }
            else{
                i=j;
            }
        }
        
        return max;
    }
}
