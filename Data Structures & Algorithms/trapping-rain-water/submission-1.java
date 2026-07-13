class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;
        int l = 0, r = height.length-1;
        int leftMax = height[l], rightMax = height[r];
        int result = 0;

        while(l<r){
            if(leftMax < rightMax){
                l++;
                leftMax = Math.max(leftMax,height[l]);
                result += leftMax - height[l];
            }
            else{
                r--;
                rightMax = Math.max(rightMax, height[r]);
                result += rightMax - height[r];
            }
        }
        return result;
        
        /*int start=0,end=0,n=height.length;
        int area = 0;
        while(start<n){
            if(height[start]<height[start+1]) continue;
            int i=start+1;
            while(i<n && height[start]<=height[i]){
                i++;
            }start = i;
            int j=start+1;
            while(j<n && height[start]>height[j]){
                j++;
            }
            end = j;
            int x =start;
            int low = Math.min(height[start],height[end]);
            while(x<j){
                area = area + low - height[x];
            }
            start = end;

        }
        return area;
        */    
    }
}
