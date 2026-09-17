class Solution {
    public boolean checkInclusion(String s1, String s2) {

        
        if(s1.length() > s2.length()){
            return false;
        }


        /**

        o(n) time and o(1) space, as the maps are bounded by o(26) space   
        which is the number of characters in the alphabet.

        o(m) for the first loop so o(m+n) becomes o(n) as m<n.

        the size of the window is fixed for the length of s1.

        so we can have a hashmap that stores the frequency of chars
        at each window. if they are equal then. valid permutation exists

        if not, then we slide the window and remove the reduce the count
        of that character.

        so rp will start at 

        */

        Map<Character,Integer> s1Freq = new HashMap<>();
         Map<Character,Integer> s2Freq = new HashMap<>();

        //frequency of s1
        for(char s:s1.toCharArray()){
            s1Freq.put(s,s1Freq.getOrDefault(s,0) + 1);
        }

        int lp=0;
        for(int rp=0; rp<s2.length();rp++){
            //for each character we want to add it to themap
            s2Freq.put(s2.charAt(rp),
            s2Freq.getOrDefault(s2.charAt(rp),0)+ 1) ;

            //max size of window
            if((rp-lp)+1 == s1.length()){
                //we can compare the two frequencies
                //if the two maps arent equal
                //then we can shift the window by moving lp up
                if(s1Freq.equals(s2Freq)){
                    return true;
                }

                //decrement the freq of the char thats being shifted
                char leaving = s2.charAt(lp);
                //if the count is 0, then {a:1, b:0}!= {a:1}

                if(s2Freq.get(leaving)==1){
                    s2Freq.remove(leaving);
                }else{
                    s2Freq.put(leaving,s2Freq.get(leaving) - 1);
                }
                lp++;

            }  

        }
        return false;


        

        
    }
}
