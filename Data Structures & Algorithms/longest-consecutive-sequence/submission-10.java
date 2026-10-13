class Solution {
    public int longestConsecutive(int[] nums) {

          /**
        [100,4,200,1,3,2]

        [1,2,3,4,100,200]

        [100]
        [200]
        [1,2,3,4] = 4

        set = {1,2,3,4,100,200}


         */

         Set<Integer> values = new HashSet<>();

         //{[3,7,2,5,8,4,6,0,1]}

         for(int num:nums){
            values.add(num);
         }
         //[100,4,200,1,3,2]

         int best = 0;
         

         for(int i=0; i<nums.length; i++){
            int current = nums[i];
            if(!values.contains(current-1)){
                int longest = 1;
                while(values.contains(current+1)){
                    current++;
                    longest++;
                }
                best = Math.max(best,longest);
            }
         }

        return best;


        
    }
}
