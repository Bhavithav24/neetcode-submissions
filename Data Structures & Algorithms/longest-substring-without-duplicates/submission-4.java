class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int length = 0;
        HashSet<Character> set = new HashSet<>();
        for(int r=0;r<s.length();r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            length = Math.max(length, r-l+1);
        }
        return length;
        /*
        int i = 0;
        int length = 0;
        int[] arr = new int[128];
        

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
        return length;*/
    }
}
