class Solution {
    public boolean isValid(String s) {

        Map<Character,Character> values = new HashMap<>();
        Stack<Character> stack = new Stack<>();

        values.put('}','{');
        values.put(']','[');
        values.put(')','(');


    //for each element push on stack, only push if opening 
    //whenever we  see  a closing check if previous is opening


   for(char c : s.toCharArray()){

	    if(c=='(' || c=='{' || c=='['){
		stack.push(c);
        }
        else{
	    char opening = values.get(c);
	        if(stack.isEmpty() || stack.peek()!=opening){
		    return false;
        }
	    stack.pop();
    }

  
    }

    return stack.isEmpty();


    }
}
