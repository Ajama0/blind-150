class Solution {
    public boolean isPalindrome(String s) {
        
        //edge case if s.charAt(i) has to be between 0-9 and a-z


        /*
        the naive solution is essentially trimming all white spaces
        and then reversing the string and checking if they are equal 
        using .equals(). 

        we can use a two pointer approach to see if the indexes at
        lp and rp are equal if so we rp down and lp up

        if we encounter a non alphanumeric char at each lp then handle
        that

        " na n"
        */

        int leftPointer = 0;
        int rightPointer = s.length() - 1 ;

        while(leftPointer<rightPointer){

            //whilst lp<rp and the character is invalid
            while(leftPointer<rightPointer &&  
            !Character.isLetterOrDigit(s.charAt(leftPointer))){
                leftPointer++;
            }
            //whilst lp<rp and the right pointer 
            while(leftPointer<rightPointer && 
            !Character.isLetterOrDigit(s.charAt(rightPointer))){
                rightPointer--;
            }
            //compare them and convert it each to lowercase
            // A!=a even though they are the same letter
            if(Character.toLowerCase(s.charAt(leftPointer)) 
            != Character.toLowerCase(s.charAt(rightPointer))){
                return false;

            }
            //if equal move up and down
            leftPointer++;
            rightPointer--;
        }

        return true;


        
    }
}
