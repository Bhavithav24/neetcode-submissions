class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        int[][] a= new int[map.size()][2];

        int x=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){ 
            a[x][1]=entry.getKey();
            a[x++][0]=entry.getValue();
        }

        Arrays.sort(a, (z, y) -> Integer.compare(z[0], y[0]));

        x=0;
        int[] result = new int[k];
        for(int i=a.length-1;i>=0 && x<k;i--){
            result[x++] = a[i][1];
        }
        
        return result;





        /*Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        for(int i=k-1;i<nums.length;i++){
            if(nums[i]==nums[i-k+1]) set.add(nums[i]);
        }
        int[] result = new int[set.size()];
        int x=0;
        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext()){
            result[x++]=itr.next();
        }return result;
        */
    }
}
