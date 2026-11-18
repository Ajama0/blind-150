class Solution {
    public void sortColors(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();


        for(int n : nums){
            map.put(n, map.getOrDefault(n,0) + 1);
        }

        for(int i = 0; i<nums.length; i++){
            if(map.getOrDefault(0,0) > 0){
                nums[i] = 0;
                 map.put(0, map.get(0) - 1);
            }else if(map.getOrDefault(1,0) > 0){
                nums[i] = 1;
                map.put(1, map.get(1) - 1);
            }else{
                nums[i] = 2;
                map.put(2, map.get(2) - 1);
            }
        }
        
    }
}