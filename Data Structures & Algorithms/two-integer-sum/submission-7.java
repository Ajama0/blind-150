class Solution {
    public int[] twoSum(int[] nums, int target) {


        /**
        brute force solution would be to have two for loops
        compare each index with every other value in the second loop
        if num[i] = num[j] == target then return new int[i,j]

        the other solution could be to have two pointers one on the left
        and one on the right

        [3,4,5,6] target = 7

        we can also sort the input
        we have lp at 3 and rp at 6 we check if they are equal to
        the target, if sum > target then rp --  else lp++

        as long as the lp != rp we can contine,

        */
        ///BRUTE FORCE SOLUTION
        // for(int i = 0; i<nums.length; i++){
        //     for(int j = i + 1; j<nums.length; j++ ){
        //         if(nums[i] + nums[j] == target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }else{
                map.put(nums[i],i);

            
            }

        
    }
    return new int[]{};


}

}
