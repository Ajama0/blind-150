class Solution {
    public int characterReplacement(String s, int k) {

        
        //map to keep track of the frequency
        Map<Character,Integer> charCount = new HashMap<>();
        int lp=0;
        int best =0;
        //result will always be the size of the valid window


        for(int rp=0;rp<s.length();rp++){
            //for each value lets add the count
            //get max frequency
            //we then see max frequency for the window so we can check 
            //total replacements for the window is valid or invalid
            charCount.put(s.charAt(rp),
            charCount.getOrDefault(s.charAt(rp), 0) + 1);

            int maxFreq = Collections.max(charCount.values());

            while((rp-lp)+1 - maxFreq > k){
                //shrink the window and slide left
                //we must update max freq for the window 

                //decrement the count for elementing shifting
                char leaving = s.charAt(lp);
                charCount.put(leaving,charCount.get(leaving)-1);
                lp++;

                //now calculate the maxFreq for the curent window
                maxFreq = Collections.max(charCount.values());


            }
            //compute the best as the size of the current valid window
            best = Math.max(best, (rp-lp)+1);


        }

        return best;
        
    }
}
