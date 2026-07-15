class MyHashSet {
    private List<Integer> data;
    public MyHashSet() {
        this.data = new ArrayList<>();
    }
    
    public void add(int key) {
        if(!data.contains(key)){
            this.data.add(key);
        }
    }
    
    public void remove(int key) {
         if(this.data.isEmpty() || !this.data.contains(key)) return;

        int indx = 0;
        int cnt = 0;
        for(int num : this.data){
            if(key == num){
                indx = cnt;
            }
            cnt++;
        }
        this.data.remove(indx);
    }
    
    public boolean contains(int key) {
        return this.data.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */