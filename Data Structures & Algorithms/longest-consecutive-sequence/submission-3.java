class Solution {
    public int longestConsecutive(int[] nums) {

        ///sort the Array
        if(nums.length==0)return 0;
        
        Arrays.sort(nums);


        /**
        original : [2,5,4,10,3,4,5]
        sorted : [2,3,4,4,5,10,20]

        
        */
        int current = 1;
        int longest = 0;
        for(int i=0; i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }else if(nums[i] + 1 == nums[i+1]){
                current++;
            }
            else{
                longest = Math.max(longest,current);
                current = 1;
            }       

        }

        //this is the case where there is no gap, but we reached the end
        return Math.max(longest,current);

    }
    
}
