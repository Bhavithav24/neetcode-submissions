class Solution {
    public void rotate(int[] nums, int k) {
        if(k > nums.length) k = k % nums.length;
        int r = nums.length - k;
        int l = 0;
        int[] t = new int[nums.length - k];
        while(l < nums.length - k){
            t[l] = nums[l++];
        }
        l = 0;
        while(r < nums.length){
            nums[l++] = nums[r++];
        }
        int m = 0;
        while(l < nums.length){
            nums[l++] = t[m++];
        }
    }
}