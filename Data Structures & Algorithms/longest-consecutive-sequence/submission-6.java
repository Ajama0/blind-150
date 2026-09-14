class Solution {
    public int longestConsecutive(int[] nums) {
        //2nd solution more optimal. 

        /**
        given a sequence [100,4,200,1,3,2]

        we place in a set so we can remove duplicates and do lookups
        
        lets identify the start of the sequence
        if a value has no left neighbour then it is the start

        if 100 - 1 doesnt exist in the set then thats the start of a seq
        100 - 1 not in set therefore start
        now we check is 100+1 in the set, and if so we continue adding
        until this condition is false, 

        the value at this point will be our longest streak
        
        now 4 comes in
        4-1 is in the set therefore not the start so we can go next iter

        when one comes in 1-1 isnt the set therefore its the start
        we then check does 1+1 exist if so we continue until it doesnt
        that will yield 1,2,3,4


        */

        Set<Integer> numbers = new HashSet<>();

        for(int i =0; i<nums.length;i++){
            numbers.add(nums[i]);
        }

        int current = 0;
        int best = 0;

        for(int num:numbers){
            if(!numbers.contains(num-1)){
                //represents the start
                current = num;
                int longest = 1;
                while(numbers.contains(current + 1)){
                    current++;
                    longest++;

                }
                if(longest>best){
                best = longest;
            } 
            }

        }
        return best;
    }
}
