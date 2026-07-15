class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int l : nums){
            set.add(l);
        }
        int res = 1;
        while(set.contains(res)){
            res++;
        }
        return res;
        
    } 
}