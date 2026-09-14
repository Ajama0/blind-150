class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        #lets first ensure the strings are of the same length

        if(len(s)!=len(t)):
            return False

        #if they are of the same length then we can use a counter dict, to see occurances of elements

        count_s={}

        #now we can loop through each element in S and increment their counter
        #use a count.get() as we check if a key exists and if we does we retrieve that key and add 1 to it, otherwise 0

        for char in range(len(s)):
            count_s[s[char]] = 1 + count_s.get(s[char], 0)
            #now all values in the string are incremented with respect to occurances

        #loop through t string 
        #check if any value of t exists in s, if so decrement it
        for i in t:
            if(i in count_s):
                count_s[i] -=1

            #if any value of count_s[] is a negative then a character occured more in one string compared to the other
                if(count_s[i] < 0):
                    return False


            #if the value of t is in not in s 
            else:
                return False


        return True            

                

                


        