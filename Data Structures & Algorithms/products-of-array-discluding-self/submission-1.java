class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int leftProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i]; 
        }
        int rightProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        
        return result;
        /*
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
        */
    }
}  
