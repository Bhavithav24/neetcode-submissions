class Solution {
    public int characterReplacement(String s, int k) {
        int length = 0;
        int l = 0;
        int freq = 0;
        int[] arr = new int[26];
        for (int r = 0; r < s.length(); r++) {
            arr[s.charAt(r) - 65]++;
            freq = Math.max(freq, arr[s.charAt(r) - 65]);
            if ((r - l + 1) - freq > k) {
                arr[s.charAt(l)-65]--;
                l++;
            }
            length = Math.max(length, (r - l + 1));
        }
        return length;
    }
}
