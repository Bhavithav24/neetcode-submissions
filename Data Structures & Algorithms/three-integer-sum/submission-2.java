class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i=0;i<=nums.length-3;i++){
            for(int j=i+1;j<=nums.length-2 ;j++){
                for(int k=j+1;k<=nums.length-1 ;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);list.add(nums[j]);list.add(nums[k]);
                        if(!result.contains(list))result.add(list);
                    } 
                }
            }
        }
        
        return result;
    }
}
