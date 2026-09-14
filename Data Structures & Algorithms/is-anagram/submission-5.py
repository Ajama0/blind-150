class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        """
        iterate through both strings, and then add them to two seperate dicts
        compare the frequencies of characters

        iterating through iterables will return the time complexity as 
        O(n+m)

        python doesnt care about the insertion order so you can easily compare
        """

        s_dict = dict()
        t_dict = dict()
        
        "racecar" "carrace"


        for i in range(len(s)):
            if (s[i] in s_dict):
                s_dict[s[i]] +=1 
            else:
                s_dict[s[i]] = 1


        for i in range(len(t)):
            if (t[i] in t_dict):
                t_dict[t[i]] +=1 

            else:
                t_dict[t[i]] = 1


        return s_dict == t_dict


                    

        