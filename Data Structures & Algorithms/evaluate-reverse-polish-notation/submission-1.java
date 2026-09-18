class Solution {
    public int evalRPN(String[] tokens) {

        /**

        so we can keep pushing onto the stack, when we encounter a
        operator we can pop from the stack, then push the result back
        to the stack, then the next element incoming is an operator
        so then we compute the result add back to the stack

        1+2 goes on stack, we see operator, pop from the stack until empty
        while(!stack.isEmpty())
        get peek, pop, get peek pop. and then perform the operation
        put resutl back in which is 3 now we see another 3 we push
        then operator pop them both and compute operation etc. 

        could we have two stacks where one holds the operator
        and the other holds the operands.

        */

        if(tokens.length == 1){
            return Integer.parseInt(tokens[0]);
        }

        Stack<Integer> operands = new Stack<>();

        int result=0;
        for(String t : tokens){

            if(!t.equals("+") && 
            !t.equals("-") && !t.equals("*") && !t.equals("/")){

                //push each number onto the stack
                operands.push(Integer.parseInt(t));
            }else{ 
                if(!operands.isEmpty() && operands.size()>1){
                    int pop2 = operands.pop();
                    int pop1 = operands.pop();

                    if(t.equals("*")){
                        result = pop1 * pop2;
                    }else if(t.equals("+")){
                        result = pop1 + pop2;
                    }else if(t.equals("-")){
                        result = pop1 - pop2;
                    }else{
                        result = pop1 / pop2;
                    } 
                    operands.push(result);
                
                         
                }
            }
        }
        return result;


        
    }
}
