class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    
    Map<Integer,Integer> frequentElements = new HashMap<>();

    for(int num:nums){
        frequentElements.put(num,
        frequentElements.getOrDefault(num,0) + 1);
    }
    
    /**
    [1,2,2,3,3,3,]
    {1:2, 2:2, 3:3}
    
    lets sort by the frequencies which returns it in ascending order
    and then we can fetch the last two elements

    to sort we need list.sort() which takes a comparator for unnatrual
    ordering. we want to iterate over the key and value together
    */
    List<Map.Entry<Integer,Integer>> entries = 
    new ArrayList<>( frequentElements.entrySet());

    //sort the entries by the values
    // if freq1 is less than freq2 then freq1 comes first etc

    
    entries.sort((a,b)-> a.getValue()-b.getValue());

    //set the capacity to the k most frequent elements 
    int[] kElements = new int[k];
    int index =0;
    ///we start at the last entry(highest freq) and stop 
    //when were less than k
    for(int i = entries.size()-1 ; i>=0 && index < k ; i--){
        kElements[index++] = entries.get(i).getKey();
    
    }

    return kElements;








    
    

    }
}
