class Solution {
    public int maxArea(int[] heights) {
        /**
        the width is represented by the index
        if two bars have height 1 and 3 then the water can only go up to
        the minimum of both(1) otherwise it will overflow. the width 
        is the index difference

        so with a two pointer approach, if lp is at start and rp is at end
        what moves the pointers is the minimum height

        if we start at nums[lp] = 1 and nums[rp]=6
        if we compute area 7*1 = 7
        now for that pointer with the minimum height we have computed its 
        maximum value for its height, if we move rp down the area becomes
        smaller so it becomes pointless in that case

        lets say we have 6 and 8
        ideally we move 6 up 
        if we dont lets say we move 8 down and the height is now 7
        the height will still be the minimum of the two and a smaller 
        width

        whereas if we have 6,8 and the next height is 9 the minimum is 9
        therefore we can compute a larger area
        */

        int maxAreaFound =0;

        int lp = 0;
        int rp = heights.length-1;

        while(lp<rp){
            //if lp and rp are the same height we can move either
            //direction

            int width = rp - lp;
            int height = Math.min(heights[lp], heights[rp]);
            int current = width*height;
            maxAreaFound = Math.max(maxAreaFound,current);

            //now how do we move the pointer
            //for a given height lets say 1, the height can never exceed 1
            //therefore at that current that is the maximum area
            //moving the rp down would calculate a smaller area

            if(heights[lp]<=heights[rp]){
                lp++;
            }else{
                rp--;
            }


            
        }

        return maxAreaFound;

        
}

}
