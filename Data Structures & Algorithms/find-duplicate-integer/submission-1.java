class Solution {
    public int findDuplicate(int[] nums) {
        /**

        this is a floyds cycle algorithm, we will first find the cycle
        intersection, then after find the start of the cycle which
        represents the duplicate.

        each value at the index represents where we should look for the
        next pointer in the chain. so nums[0] = 1, the next pointer
        is at index 1 so we have 0->1->2

        we set slow and fast to 0 

        there will always be a cycle guaranteed.
        */

        int slow = 0;
        int fast = 0;

        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];

            if(fast == slow){
                break;
            }
        }

        //now we found the intersection, where slow meets fast
        //distance from fp to cycle start = distance from head to cycle
        //have another pointer 

        int slow2 = 0;
        while(true){
            slow2 = nums[slow2];
            slow = nums[slow];

            if(slow2 == slow){
                return slow;
            }
        }




        
    }
}
