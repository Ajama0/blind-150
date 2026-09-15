class Solution {
    public int lengthOfLongestSubstring(String s) {
        /**
        substring, subarray - sliding window is a shout
        dynamic window or is it fixed?

        zxyxyz = 3

        you cant use a hashset because its not contigious
        lets say we have abcadef -> {abcdef} which is not contigious

        if we have lp at 0 and rp = lp+1
        we move the window across when we reach a value that fails the 
        condition it means that within that substring ther is a duplicate
        so reset lp = rp and move the rp so that they arent equal

        */

        Set<Character> window = new HashSet<>();
        int lp = 0;
        int best = 0;
        int rp = 0;

            //add the first element to the set
            while(rp<s.length()){
                
                if(window.add(s.charAt(rp))){
                    rp++;
                    best = Math.max(best,window.size());
                }else{
                    //if i cant add to the window means duplicate
                    //so lets shift our window to the left
                    //and create a new window by removing the one we 
                    //shifted
                    window.remove(s.charAt(lp));
                    lp++;

                }
            }
        return best;

            
        




        
    }
}
