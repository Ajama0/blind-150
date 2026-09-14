class Solution {
    public boolean isAnagram(String s, String t) {

        // lets have two hashmaps to keep track of each character freq
        //the key would be the frequency and the value would be the character
        //this is because we can do an equals on the integers(freq)
        // we can then do an equality check on the hashmap

    
    Map<Character, Integer> s_map = new HashMap<>();
    Map<Character, Integer> t_map = new HashMap<>();
    
    for(char c : s.toCharArray()){
        if(s_map.containsKey(c)){
            s_map.put(c, s_map.get(c) + 1);
        }else{
            s_map.put(c,1);
        }
    
    }
    for(char c : t.toCharArray()){
        if(t_map.containsKey(c)){
            t_map.put(c, t_map.get(c) + 1);
        }else{
            t_map.put(c,1);
        }
    
    }

    ///compare the hashmaps
    return s_map.equals(t_map);


    }
}
