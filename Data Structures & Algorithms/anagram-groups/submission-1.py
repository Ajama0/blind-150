class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        """
        if we sort the array, something like where cat and act becomes the same
        and then we iterate through the strs whereas

        the key in the dict is the sorted word,
        for every word we sort it and check if its in the dict
        if it is then the original word before sorting gets appended withint the list as the value


        ["cat" , "act", "pots", "tops", "stop" ]

        {act: ["act, "cat"]}


        time complexity : O(n x m log m) - because were iterating through the words
        and for each word we sort it

        space complexity : O(n) - storing of the dicts.


        """ 
    

        temp_dict = dict()

        for word in strs:
            sorted_word = "".join(sorted(word))
            if sorted_word in temp_dict:
                temp_dict[sorted_word].append(word)

            else:
                temp_dict[sorted_word] = [word]


        return list(temp_dict.values())      









