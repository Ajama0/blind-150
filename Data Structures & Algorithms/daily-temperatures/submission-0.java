class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        /*

        this is a monotonic stack question where the inputs are decreasing

        if we put 30 (index 0) on the stack and 38 comes in
        38 is a warmer day so we set results[max.peek()] = i-peek()

        and then we pop 30 and push 38
        now 38 comes in we see 30 36 35 are not warmer.
        we see 40 we pop 35, whats the index difference between 35? 1
        and then we keep popping and now 40 remains on the stack
        
        so while(temp[i] > max.peek()){
            pop
            set result[max.peek()] = i - max.peek()
        }

        stack.push(temp) 

        */


        Stack<Integer> stack = new Stack<>();

        int[]result = new int[temperatures.length];

        for(int i =0; i<temperatures.length;i++){

            while(!stack.isEmpty()
             && temperatures[i]>temperatures[stack.peek()]){
                //when we see a higher temp lets pop
                result[stack.peek()] = i - stack.peek();
                stack.pop();
                //we push the index so its easier to track
                //stack.push(i);
                

            }
            stack.push(i);


            //whatever values are left on the stack they will be 0
            //in the result
            
        }

        return result;

       
    }
}
