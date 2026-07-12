class Solution {
    public int maxArea(int[] heights) {
        int l=0,n=heights.length,r=n-1;
        int max = 0;
        while(l<r){
            int hgt = -1;
            int len=r-l; 
            
            if(heights[l]<heights[r]){
                hgt = heights[l];
                l++;
            }else{
                hgt = heights[r];
                r--;
            }
            max = Math.max(hgt*len,max);
        }return max;
        
    }
}
