class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        """
        what we can do is iterate through the same loop twice 
        this gives us a time complexity of O(n^2), then for every i
        we compare it with j until we see that nums[i] + nums[j] == target

        time complexity o(n)
        """
        [3,4,5,6] 
        [3,4,5,6]

        for i in range(len(nums)):
            for j in range(len(nums)):
                if (i!=j) and nums[i] + nums[j] == target:
                    return [i,j]