class Solution {
    public int findMin(int[] nums) {
        /**

        the brute force would be iterating through the input
        and finding the minimum that way

        rotated [3,4,5,6,1,2] 

        the input is still half sorted, for ex [3,4,5,6 -> 1,2]
        if we look at the mid lets say 5, in a normal BS the mid 
        is always less than the end (rp)

        if mid > rp we know that the minimum is somewhere on the right
        so we can search from mid + 1

        otherwise if mid<rp then we search to the left but that mid
        could also be our minmum 

        [5,6,1] if mid is 6 now, we know if mid>rp then smaller is 
        to the right. 

        */


        int lp = 0;
        int rp = nums.length - 1;

        while(lp<rp){
            int mid = lp + (rp-lp) / 2;

            if(nums[mid]>nums[rp]){
                //we look to the right because thats where min is
                lp = mid + 1;
            }else{
                //otherwise if mid<rp which is standard then lets look 
                //left, but in our case mid could be minimum so include
                rp = mid;
            }
        }

        return nums[rp];
        
    }
}
