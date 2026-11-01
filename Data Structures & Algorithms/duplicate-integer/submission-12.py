class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        hi = set()
        for i in range(0,len(nums)):
            hi.add(nums[i])
        if(len(hi) != len(nums)):
            return True
        else:
            return False

        