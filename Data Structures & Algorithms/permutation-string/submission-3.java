class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] a =  new int[128];
        int[] b =  new int[128];
        int l = 0;
        int x = 0;
        for(int i = 0; i < s1.length(); i++){
            a[s1.charAt(i)]++;
        }
        for(int r = 0; r < s2.length(); r++){
            b[s2.charAt(r)]++;
            if(l > 0){
                b[s2.charAt(x++)]--;
            }
            if(r >= s1.length() - 1){
                l++;
                if(Arrays.equals(a,b)) return true;
            }
        }
        return false;
    }
}
