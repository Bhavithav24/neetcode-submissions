class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int l = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int r = 0; r < nums.length; r++){
            if(map.containsKey(nums[r]) && r-map.get(nums[r])<=k){
                return true;
            }
            map.put(nums[r],r);
            /*
            if(!map.containsKey(nums[r])){
                map.put(nums[r],r);
            }else{
                int i = map.get(nums[r]);
                int abs = r-i;
                if(abs<0) abs = -abs;
                if(abs<=k) return true;
                map.put(nums[r],r);
            }
            */
        }return false;
    }
}