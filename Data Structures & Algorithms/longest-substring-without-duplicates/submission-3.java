class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int i = 0;
        int length = 1;
        int[] empty = new int[128];
        int[] arr = empty;

        int currentLength = 0;
        while(i<s.length()){
            int j=i; 
            currentLength = 0;
            while(j<s.length() && arr[s.charAt(j)] == 0){
                arr[s.charAt(j)] = 1;
                currentLength++;
                j++;
            }
            int[] empt = new int[128];
            arr = empt;
            if(length<currentLength){
                length = currentLength;
            }
            i++;
        }
        return length;
    }
}
