class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
       

        original = (nums)
        check = set(nums)

        if len(original) == len(check):
            return False

        else:
            return True  
        

        