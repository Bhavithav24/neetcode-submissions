class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String s : tokens){
            //else cal using if else ladder
            if(s.equals("+")){
                st.add(st.pop() + st.pop());
            }
            else if(s.equals("*")){
                st.add(st.pop() * st.pop());
            }
            else if(s.equals("/")){
                int y = st.pop();
                int x = st.pop();
                st.add(x/y);
            }
            else if(s.equals("-")){
                int y = st.pop();
                int x = st.pop();
                st.add(x-y);
            }
            else{
            st.add(Integer.valueOf(s));
            /*
            // push if number
            //convert s to number
                int n = 0;
                int x = 0;
                if(s.charAt(0) == '-') x = 1;
                for(int i = x; i < s.length(); i++){
                    n = n * 10 + (s.charAt(i) - '0');
                }
                if(x == 1) n = -n;
                st.push(n);
                */
            }
        }
        return st.pop();
    }
}
