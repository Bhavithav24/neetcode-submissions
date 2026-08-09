class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n = piles.length;
        int max = piles[n - 1];
        int l = 1, r = max;
        int k = max;
        while(l <= r){
            int mid = l + (r - l)/2;
            int c = 0;
            int j = 0;
            while(j < n){
                c += (piles[j] + mid - 1)/mid;
                j++;
            }
            
            if (c <= h){
                r = mid - 1;
                k = mid;
            }
            else{
                l = mid + 1;
            }
        } 
        return k;
    }   
}
