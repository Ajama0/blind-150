class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        
        """
        first you have to check if they are equal in length otherwise return false
        s = racecarr
        t = carrace
        would return false
        
        we can create two dictionaries and append each character with its count
        iterating over both strings gives time complexity o(n+m), therefore you can 
        later compare both dicts to see if they have the same key value pairs

        """

        if(len(s) != len(t)):
            return False
        
        s_count = {}
        t_count = {}
        for i in range(len(s)):
            if s[i] not in s_count:
                s_count[s[i]] = 1
            else:
                 s_count[s[i]] +=1
                    

        for j in range(len(t)):
            if t[j] not in t_count:
                t_count[t[j]] = 1

            else:
                t_count[t[j]] += 1


        #we compare the key value pair counts
        print(s_count)
        print(t_count)
        return s_count == t_count

                   

   
                

                    
                

                




               

            

            


