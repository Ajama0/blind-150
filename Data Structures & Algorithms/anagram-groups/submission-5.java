class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> anagrams = new HashMap<>();


        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String s = new String(chars);

            if(anagrams.containsKey(s)){
                anagrams.get(s).add(str);
            }else{
                List<String> newList = new ArrayList<>();
                newList.add(str);
                anagrams.put(s, newList);
            }

        }

        return new ArrayList<>(anagrams.values());


        
    }
}
