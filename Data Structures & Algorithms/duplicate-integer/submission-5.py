class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        
        """
        if duplicate and non-duplicate are equal it means 
        the output must return false
        """
        duplicate = len(nums) 
        non_duplicate = set(nums) 

        if duplicate == len(non_duplicate):
            return False
        return True    

    

