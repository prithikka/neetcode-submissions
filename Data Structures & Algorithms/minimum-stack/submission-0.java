class MinStack {
    Stack<Integer> s;
    Stack<Integer> minst;
    public MinStack() {
     s=new Stack<>();
     minst=new Stack<>();   
    }
    
    public void push(int val) {
        s.push(val);
        if (minst.isEmpty())
            minst.push(val);
        else
            minst.push(Math.min(val, minst.peek()));
    }
    
    public void pop() {
        s.pop();
        minst.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return minst.peek();
    }
}
