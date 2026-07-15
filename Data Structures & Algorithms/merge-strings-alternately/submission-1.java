class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0;
        String res = "";
        while(i<word1.length() && j<word2.length()){
            res = res+word1.charAt(i++)+word2.charAt(j++);
        }
        if(i<word1.length()){
            res = res+word1.substring(i,word1.length());
        }
        if(j<word2.length()){
            res = res+word2.substring(j,word2.length());
        }
        return res;
    }
}