class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:


        """
        if we iterate through the nums list
        use a hashmap and set a counter

        for every number we see insert the number as the key
        if seen we the number we add one more to the value

        depending on the value of k we return the most frequent elements

        well if we sort the values by descending order,
        we can start at the most frequent number and stop at k

        {3:3, 2:2, 1:1}
        
        we want to sort the dict and this returns a list which is perfect for slicing
        sorted function by default returns sorted keys
        the lambda tells it how to sort it - by frequencies of value
        

        so now we can have a list
        and the list looks something like []


        o(n) time complexity as we iterate over the single nums array

        """

        counter = {}

        for i in nums:
            if i in counter:
                counter[i] +=1
            else:
                counter[i] = 1  


        sorted_keys = sorted(counter, key= lambda x: counter[x], reverse = True)

        return sorted_keys[:k]










        


        