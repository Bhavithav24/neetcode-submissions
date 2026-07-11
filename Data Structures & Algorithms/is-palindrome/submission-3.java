class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        char[] t=s.toCharArray();
        int left=0;
        int right=t.length-1;
        while(left<=right){
            if(t[left]==t[right]){
                left++;
                right--;
            }else{
                return false;
            }
        }return true;
        /*String t="";
        for(int i=s.length()-1;i>=0;i--){
            int asc = s.charAt(i);
            if( (asc>=65 && asc<=90) || (asc>=97 && asc<=122) || (asc>=48 && asc<=57) )t = t+s.substring(i,i+1);
        }
        t=t.toLowerCase();
        String ss = "";
        for(int i=t.length()-1;i>=0;i--){
            ss = ss+t.substring(i,i+1);
        }
        return t.equals(ss);
        */
    }
}
