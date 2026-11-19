class Solution {
    public int maxSubArray(int[] nums) {
        int best = nums[0];
        int current = 0;


        for(int n:nums){

            if(current<0){
                current = 0;
            }
            current+=n;

            best = Math.max(best,current);
        }

        return best;
        
    }
}
