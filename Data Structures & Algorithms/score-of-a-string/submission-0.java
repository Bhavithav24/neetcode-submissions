class Solution {
    public int scoreOfString(String s) {
        int[] a = new int[s.length()];
        int i = 0;
        for(char c : s.toCharArray()){
            a[i++] = c;
        }
        int sum = 0;
        for(int j = 0; j < s.length() - 1; j++){
            int x = s.charAt(j);
            int y = s.charAt(j+1);
            if(y - x < 0) sum += -1 * (y - x);
            else sum += y-x;
        }
        return sum;
    }
}