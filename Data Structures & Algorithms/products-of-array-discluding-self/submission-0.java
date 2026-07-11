class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int i=0;
        while(i<nums.length){
            int lp =1,l=0;
            int rp =1,r=nums.length-1;
            while(l<i){
                lp*=nums[l];
                l++;
            }
            while(r>i){
                rp*=nums[r];
                r--;
            }
            result[i++]=lp*rp;
        }
        return result;
    }
}  
