class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        int min=Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        int start = 0;
        
        for(int l=0;l<nums.length;l++){
            int x = nums[l];
            if(x>=0){
                set.add(x);
                
                max = Math.max(max,x);
            }
        }
        int res = 1;
        while(res<=max){
            if(!set.contains(res)) return res;
            res++;
        }
        return res;
        
    } 
}