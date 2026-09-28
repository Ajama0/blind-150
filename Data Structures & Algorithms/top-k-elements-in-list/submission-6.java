class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> freqCount = new HashMap<>();

        for(int n :nums){
            freqCount.put(n, freqCount.getOrDefault(n, 1) + 1);
        }

        ///we then can sort the map by the values
        List<Map.Entry<Integer,Integer>> entry = new ArrayList<>(freqCount.entrySet());

        //sort it by desending order
        entry.sort((a,b) -> b.getValue() - a.getValue());
        
        //iterate over the entry set until k 
        int[] topK = new int[k];
        for(int i = 0; i<k ; i++){
            topK[i] = entry.get(i).getKey();
        }

        return topK;
    }
}
