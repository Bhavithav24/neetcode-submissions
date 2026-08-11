class TimeMap {
    HashMap<String, Map<Integer, String>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key, new HashMap<>());
        }  
        map.get(key).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)){
            return "";
        }
        
        int n = -1;
        
        for(int t : map.get(key).keySet()){
           if(t <= timestamp) n = Math.max(t, n);
        }

        if(n == -1) return "";
        return map.get(key).get(n);
    }

        /*HashMap<Integer, String> map = new HashMap<>();
    Stack<Integer> prev = new Stack<>();
    public TimeMap() {
        map = new HashMap<>();
        prev = new Stack<>();
    }
    
    public void set(String key, String value, int timestamp) {
        prev.push(timestamp);
        map.put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        if(prev.isEmpty()) return "";
        if(map.containsKey(timestamp)) return map.get(timestamp);
        Stack<Integer> s = new Stack<>();
        s = prev;
        while(!s.isEmpty() && s.peek() > timestamp){
            s.pop();
        }
        if(s.isEmpty()) return "";
        return map.get(s.peek());*/
}
