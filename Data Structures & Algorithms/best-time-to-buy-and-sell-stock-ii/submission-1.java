class Solution {
    public int maxProfit(int[] prices) {
        int prof = 0;
        for(int r=1;r<prices.length;r++){
            int sum = prices[r] - prices[r-1];
            if(sum>0) prof+= sum;
        }return prof;
    }
}