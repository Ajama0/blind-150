class Solution {
    public boolean isValid(String s) {

        Map<Character, Character> pairs = new HashMap<>();
    pairs.put(')', '(');
    pairs.put(']', '[');
    pairs.put('}', '{');
        
    

    Stack<Character> stack = new Stack<>();

    for(char c : s.toCharArray()){
        
        //if opening bracket push it onto the stack
    if(c == '(' || c=='{' || c=='['){
        stack.push(c); 
    }else{
        //a closing bracket coming first means always invalid
        if(stack.isEmpty() || pairs.get(c)!=stack.peek()){
            return false;
        }
        stack.pop();

        }
    }

    return stack.isEmpty();

    }
}
