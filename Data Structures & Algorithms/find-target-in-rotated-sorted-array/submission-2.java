class Solution {
    public int search(int[] nums, int target) {

        int lp = 0;
        int rp = nums.length - 1;

        while(lp<=rp){

            int mid = lp + (rp-lp)/2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid]>nums[rp]){
                //this means this is the sorted side, check in 
                if(nums[lp]<= target && target <nums[mid]){
                    rp = mid-1;
                }else{
                    lp = mid + 1;
                }
            }else {
                //this means the right side is sorted
                //lets search there
                if(nums[mid]< target && target<=nums[rp]){
                lp = mid + 1;
                }else{
                    rp = mid-1;
                }

        }

        }

        return -1;
        
    }
}
