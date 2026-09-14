class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        /*
        the brute force solution would be O(n^3)
        because for each value we will iterate again and for that 2nd 
        value we will look for a third value that combines
        [i]+[j]+[k] to equal 0, then the 2nd iteration gets incremented
        etc.

        this is essentially the 2sum but with a for loop
        we know nums[i] + nums[j] + nums[k] == 0
        hence we need two numbers to sum up to equal complement nums[k]

        we also need to sort the array so that we know the direction of 
        pointers

        [-1,0,1,2,-1,-4]
        [-4,-1,-1,0,1,2]

        if lp and rp are always greater than i it means we can never
        produce duplicates

        -1+0+1 at the index 1
        when we reach index 3 which is value 0 we ensure that it doesnt 
        check from the first index instead the lp and rp always to the 
        right.

        we stop at nums.length - 2 because the 2nd last value lets say 
        1 in our case only has 1 neighbour so it wont be able to 
        formulate  a triplet

        also we reset lp and rp per iteration.

        

         //i in the loop is equal to first element in triplet
         //rp and lp must be greater than i to prevent duplicate triplets 
         //in different orders. also prevents lp and rp being stuck

         */

         Arrays.sort(nums);

        List<List<Integer>> triplets = new ArrayList<>();


        for(int i=0; i<nums.length -2 ;i++){
            //first check to see if i isnt the same as before
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int lp = i + 1;
            int rp = nums.length-1;
            while(lp<rp){

                if(nums[lp] + nums[rp] > -nums[i]){
                    rp--;
                }else if(nums[lp] + nums[rp] < -nums[i]){
                    lp++;
                }
                else{
                    ///means that nums[lp] + nums[rp] = -nums[i]
                    //we need to move lp and rp to prevent infinite 
                    //triplets for the same
                    triplets.add(List.of(nums[i],nums[lp], nums[rp]));
                    lp++;
                    rp--;

                    //there could be more triplets
                    //if the previous lp record is equal to next lp
                    //then we can end up recording the same value again
                    while(lp<rp && nums[lp]==nums[lp-1]){
                        lp++;
                    }
                    while(lp<rp && nums[rp]==nums[rp+1]){
                        rp--;
                    }


                }


            }
        }

        return triplets;

        
    }
}
