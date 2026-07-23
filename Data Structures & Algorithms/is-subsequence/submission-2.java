class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        int i = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)){
                if(s.length() == i) return true;
                i++;
            }
            j++;
        }
        return s.length() == i;
    }
}
