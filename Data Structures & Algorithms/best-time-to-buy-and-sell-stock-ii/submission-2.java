class Solution {
    public int maxProfit(int[] prices) {
        
        int prof = 0;
        for(int r=1;r<prices.length;r++){
            int l = r-1;
            int sum = prices[r] - prices[l];
            if(sum>0) prof+= sum;
        }return prof;
    }
}