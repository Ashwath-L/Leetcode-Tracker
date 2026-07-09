// Last updated: 7/9/2026, 3:09:48 PM
class MinStack {
    Stack<Integer> stack;
    Stack<Integer> mini;

    public MinStack() {
        stack = new Stack();
        mini = new Stack();
    }
    
    public void push(int val) {
        stack.push(val);
        if(mini.size() > 0) {
            val = Math.min(val,mini.peek());
        }
        mini.push(val);
        
    }
    
    public void pop() {
        stack.pop();
        mini.pop();
        
    }
    
    public int top() {
        return stack.peek();
        
    }
    
    public int getMin() {
        return mini.peek();
        
    }
}

