class Solution {
    public int[] dailyTemperatures(int[] a) {
        int n = a.length;
        int res[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            //int x = i;
            while(!st.isEmpty() && a[st.peek()] < a[i]){
                res[st.peek()] = i - st.peek();
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            res[st.peek()] = 0;
            st.pop();
        }
        return res;
    }
}
