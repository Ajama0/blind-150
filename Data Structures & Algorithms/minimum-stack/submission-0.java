class MinStack {
    //a min stack to track the minimum
    Stack<Integer> minStack;
    Stack<Integer> stack;

    /*
    when we push onto the stack we first check if the stack is empty
    then the minimum becomes the first value we push

    now on each other entry, if the current min is less than the new   
    value  being pushed in, then the we push the current min to the 
    minstack   and also the new value
    */
    

    public MinStack() {
        minStack = new Stack<>();
        stack = new Stack<>();

    }
    
    public void push(int val) {

        if(!stack.isEmpty() && val > minStack.peek()){
            //we want to repeatedly push the min onto the stack
            
            minStack.push(minStack.peek());
            stack.push(val);       
        }else{
            //if thats not the case we can reset the minimum to val
            minStack.push(val);
            stack.push(val);
        }   
        
    }
    
    public void pop() {
        //if we pop an element we must pop it from both
        stack.pop();
        minStack.pop();
        
    }
    
    public int top() {
       return stack.peek();

        
    }
    
    public int getMin() {
        //the peek of the current minStack
        return minStack.peek();
        
    }
}
