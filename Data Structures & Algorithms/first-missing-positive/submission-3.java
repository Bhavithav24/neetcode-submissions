class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int res = 1;
        for(int i : nums){
            if(i<=0) continue;
            if(res==i)res++;
        }
        return res;
        
    } 
}