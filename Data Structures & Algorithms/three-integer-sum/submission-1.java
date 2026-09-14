class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        /*
        pairs of numbers adding to some value
        -4 + 2 + 2 = 0
        if 2+2 = 4 then the first condition is true

        */
        Arrays.sort(nums);

        List<List<Integer>> triplets = new ArrayList<>();
        for(int i = 0; i<nums.length-2; i++){
            //make sure that k doesnt repeat again
            //if we have [-4,-4] we already know the first -4 
            //looked for al possible values
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int lp = i + 1;
            int rp = nums.length -1;

            while(lp<rp){
                if(nums[lp] + nums[rp] < -nums[i]){
                    lp++;
                }
                else if(nums[lp] + nums[rp] > -nums[i]){
                    rp--;
                }else{
                    //otherwise we found a match
                    //lets move pointers to find another triplet for i
                    //and also record
                    triplets.add(List.of(nums[i], nums[lp], nums[rp]));
                    
                    lp++;
                    rp--;
                    //keep skipping if values is same as just recorded
                    while(lp<rp && nums[lp] == nums[lp-1]){
                        lp++;

                    }
                    //compare previous nums[rp] with current, but remember 
                    //rp gets moved down so previous is rp+1
                    while(lp<rp && nums[rp] == nums[rp+1]){
                        rp--;

                    }
                
                    
                }

            }

        }

        return triplets;


        
    }
}
