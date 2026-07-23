class Solution {
    public int[] replaceElements(int[] arr) {
       int m = -1;
       int n = arr.length;
       int res[] = new int[n]; 
       for(int i = n - 1; i >= 0; i--){
            int cur = arr[i];
            res[i] = m;
            m = Math.max(m, cur);
       }
       return res;
    }
}