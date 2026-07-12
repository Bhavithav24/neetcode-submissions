class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int a=0;a<nums.length-2;a++){
            int l=a+1,r=nums.length-1,t = -nums[a];
            while(l<r){
                int sum=nums[l]+nums[r];
                if(sum==t){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[a]);list.add(nums[l]);list.add(nums[r]);
                    if(!result.contains(list))result.add(list);
                }
                if(sum<t) l++;
                else r--;
            }
        }
        return result;
        /*
        for(int i=0;i<=nums.length-3;i++){
            for(int j=i+1;j<=nums.length-2 && nums[i]<=nums[j];j++){
                for(int k=j+1;k<=nums.length-1 && nums[i]<=nums[k];k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);list.add(nums[j]);list.add(nums[k]);
                        if(!result.contains(list))result.add(list);
                    } 
                }
            }
        }
        return result;
        */
    }
}
