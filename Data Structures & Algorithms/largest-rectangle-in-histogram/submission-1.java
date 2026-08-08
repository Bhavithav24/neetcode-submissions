class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> val = new Stack<>();
        Stack<Integer> idx = new Stack<>();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < heights.length; i++){
            if(val.isEmpty() || val.peek() <= heights[i]){
                val.push(heights[i]);
                idx.push(i);
            }
            else{
                int l = idx.peek();
                while(!val.isEmpty() && val.peek() > heights[i]){
                    l = idx.peek();
                    max = Math.max(max,(i - idx.pop()) * val.pop());
                }
                val.push(heights[i]);
                idx.push(l);
            }
        }
        while(!val.isEmpty()){
            max = Math.max(max, val.pop()*(heights.length - idx.pop()));
        }
        return max;
    }
}
