class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==1){
            return 1;
        }else if(nums == null){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>(nums.length);
        int l =0;
        for(int n: nums){
            set.add(n);
        }
        for(int cn:set){
            if(!set.contains(cn-1)){
                int cl = 1;
                int n= cn;
                while(set.contains(n+1)){
                    cl++;n++;
                }l = Math.max(l,cl);
            }
        }return l;
        
    }
}