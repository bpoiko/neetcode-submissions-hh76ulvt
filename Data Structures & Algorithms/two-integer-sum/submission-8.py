class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        numba = {}

        for i, num in enumerate(nums):
            diff = target - num
            if diff in numba:
                return [numba[diff], i]
            numba[num] = i
        