class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int l = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[l++]) return nums[i];
        }
        return nums[nums.length - 1];
    }
}
