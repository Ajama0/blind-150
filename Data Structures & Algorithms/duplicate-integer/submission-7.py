class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        #convert the nums to a set which doesnt allow duplicates
        #then compare the set with the initial list

        n_duplicate = set(nums)

        return len(nums) != len(n_duplicate)
               


