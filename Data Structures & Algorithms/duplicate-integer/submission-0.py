class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool: 
        len_nums = len(nums)
        set_nums = set(nums)
        len_set = len(set_nums)

        if(len_nums != len_set):
            return True

        return False    


         