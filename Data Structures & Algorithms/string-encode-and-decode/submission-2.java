class Solution {

    public String encode(List<String> strs) {
        String encresult = "";
        for(String s : strs){
            encresult = encresult+s+"a1@s";
        }
        return encresult;
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int prev = 0;
        for(int i=0;i+4<=str.length();i++){
            if(str.substring(i,i+4).equals("a1@s") ){
                result.add(str.substring(prev,i));
                prev = i+4;i=i+3;
            }
        }
        return result;
    }
}
