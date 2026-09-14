class Solution {
    public boolean isAnagram(String s, String t) {

        // lets have two hashmaps to keep track of each character freq
        //the key would be the Character and the value would be the freq
        // get or default allows us to prevent null values. if c doesnt exist we default to a value of 0 + 1, otherwise we return the value + 1
        // we can then do an equality check on the hashmap

    if(s.length() != t.length()){
        return false;
    }
    
    Map<Character, Integer> s_map = new HashMap<>();
    Map<Character, Integer> t_map = new HashMap<>();
    
    for(char c : s.toCharArray()){
        s_map.put(c, s_map.getOrDefault(c,0) + 1);
    
    }
    for(char c : t.toCharArray()){
       t_map.put(c, t_map.getOrDefault(c,0) + 1);
    }

    ///compare the hashmaps full mappings
    return s_map.equals(t_map);


    }
}
