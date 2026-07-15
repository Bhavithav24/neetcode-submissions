class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int res = 1;
        for(int i =0;i<nums.length;i++){
            if(nums[i]<=0) continue;
            if(res==nums[i])res++;
        }
        return res;
        
    } 
}