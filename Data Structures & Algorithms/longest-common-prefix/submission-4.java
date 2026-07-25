class Solution {
    public String longestCommonPrefix(String[] strs) {
        String fst = strs[0];
        for(int i = 0; i < fst.length(); i++){
            char c = fst.charAt(i);
            for(int j = 1; j < strs.length; j++){
                if(strs[j].length() <= i || c != strs[j].charAt(i)) return fst.substring(0,i);
            }
        }
        return fst;
    }
}