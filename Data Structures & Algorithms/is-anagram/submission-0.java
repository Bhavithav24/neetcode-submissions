class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sa = new char[26];
        char[] ta = new char[26];
        for(char c : s.toCharArray()){
            sa[c-97]++;
        }
        for(char c : t.toCharArray()){
            ta[c-97]++;
        }
        for(int i=0;i<26;i++){
            if(ta[i]!=sa[i]){
                return false;
            }
        }return true;
    }
}
