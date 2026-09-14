class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> anagrams = new HashMap<>(); //o(n)
        for(int i=0; i<strs.length; i++){ //o(n)
            char[] chars = strs[i].toCharArray(); 
            Arrays.sort(chars); //o (k log k)
            String sorted = new String(chars); //o(k)

            //o(n) * o(k log k)
        

            /**
            if the key exists it ignore the Function and returns the
            value(list) and we append to it outside, otherwise it returns
            a new list and we append.

            act:[act,cat]
            -act gets sorted placed in map with new list, then add val
            - cat gets sorted 'act' isnt absent therefore Function ignored

            */
            if(!anagrams.containsKey(sorted)){
                anagrams.put(sorted,new ArrayList<>());//o(k)
            }

            //act:[]
            anagrams.get(sorted).add(strs[i]);

        }

        return new ArrayList<>(anagrams.values()); 

        
        
    }

}
