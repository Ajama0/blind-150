
class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        //set - ordered collection of elements with no duplicates
        Set<Integer> set = new HashSet<>();


        for(int num: nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
        
        
    }
}