class Solution {
    public int longestConsecutive(int[] nums) {

        /*

        [2,3,4,5] 

        [10]

        [20]

        if(num[i] doesnt exist in the set)
        then that is our start. 
        we can keep checking if num[i+1] exists if it does 

        we can use a hashset to remove the duplicates 
        and check if x-1 exists

        track longest sequence
        */

        Set<Integer> values = new HashSet<>();
        //add the values to the set

        for(int num:nums){
            values.add(num);
        }
    
        int bestSequence = 0;
        for(int i=0; i<nums.length;i++){
            int current = nums[i];
            //every sequence starts at 1
            int currentSequence = 1;
            if(!values.contains(nums[i]-1)){
                //start of our sequence, we want to keep incrementing
                while(values.contains(current+1)){
                    currentSequence++;
                    current++;
                } 
                bestSequence = Math.max(currentSequence,bestSequence);

            }
             

        }

        return bestSequence;
        
    }
}
