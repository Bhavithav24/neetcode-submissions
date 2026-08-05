class MinStack {
    Stack<Integer> s = new Stack<>();
    Stack<Integer> ms = new Stack<>();
    int min = 0;
    public MinStack() {
        min = 0;
    }
    
    public void push(int val) {
        s.push(val);
        if(ms.isEmpty() || ms.peek() >= val){
            ms.push(val);
        }
    }
    
    public void pop() {
        int val = s.peek();
        s.pop();
        if(ms.peek() == val) ms.pop();
    }
    
    public int top() {
        if(s.isEmpty()) return 0;
        return s.peek();
    }
    
    public int getMin() {
        if(ms.isEmpty()) return 0;
        return ms.peek();
    }
}
