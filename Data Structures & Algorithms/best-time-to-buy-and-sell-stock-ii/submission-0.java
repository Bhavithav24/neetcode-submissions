class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int prof = 0;
        for(int r=1;r<prices.length;r++){
            int sum = prices[r] - prices[l];
            if(sum>0) prof+= sum;
            l++;
        }return prof;
    }
}