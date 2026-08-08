class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < position.length; i++){
            map.put(position[i], speed[i]);
        }
        Stack<Double> st = new Stack<>();
        Arrays.sort(position);
        for(int i = position.length - 1; i >= 0; i--){
            double time = (double)(target - position[i]) / map.get(position[i]);
            st.push(time);
            if(st.size() >= 2 && st.peek() <= st.get(st.size() - 2)) st.pop();

        }
        return st.size();
    }
}