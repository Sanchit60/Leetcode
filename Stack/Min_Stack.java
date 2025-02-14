class MinStack {

    Stack<Integer> normalSt;
    Stack<Integer> minStack; 

    public MinStack() {
        normalSt = new Stack<>();
        minStack =  new Stack<>();

    }

    public void push(int val) {
        normalSt.push(val);
        if(minStack.size() == 0){
            minStack.push(val);
        }else{
            int min = Math.min(val, minStack.peek());
            minStack.push(min);
        }
    }

    public void pop() {
        normalSt.pop();
        minStack.pop();
    }

    public int top() {
        return normalSt.peek();
        
    }

    public int getMin() {
        return minStack.peek();

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
