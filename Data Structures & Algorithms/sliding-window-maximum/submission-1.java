class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l = 0;
        int n = 0;
        int[] res = new int[nums.length - k + 1];
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for(int r = 0; r < nums.length; r++){
            maxheap.add(nums[r]);
            if(r - l + 1 == k){
                res[n++] = maxheap.peek();
                maxheap.remove(nums[l]);
                l++;
            }
        }
        return res;
    }
}
