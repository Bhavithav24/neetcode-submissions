class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int rl = n + m;
        int[] res = new int[rl];
        int x = 0;
        int l = 0; 
        int r = 0;
        while(l < n && r < m){
            if(nums1[l] <= nums2[r]){
                res[x++] = nums1[l++];
            }else{
                res[x++] = nums2[r++];
            }
        }
        while(l < n){
            res[x++] = nums1[l++];
        }
        while(r < m){
            res[x++] = nums2[r++];
        }

        int mid = rl/2;
        if(rl % 2 == 0){
            return (double) (res[mid] + res[mid - 1]) / 2.0;
        }
        else{
            return (double) res[mid];
        }
        /*int n = nums1.length;
        int m = nums2.length;
        if(n == 0 || m ==0){
            if(n > m) return nums1[n/2];
            else return nums2[m/2];
        }
        if(n==m){
            double ans = (double) (nums1[n-1] + nums2[0]) / 2.0;
            return ans;
        }if(n < m){
            return (double)(nums2[0]);
        }else{
            return (double)(nums1[n-1]);
        }
    */
    }
}
