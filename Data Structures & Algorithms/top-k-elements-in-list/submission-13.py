import heapq
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        # from the start my list will be k long

        count = {}
        h = []
        for num in nums:
            count[num] = count.setdefault(num,0) + 1
        
        for num, cnt in count.items():
            heapq.heappush(h,(cnt,num))
            if(len(h) > k):
                heapq.heappop(h)
            
        return [num for cnt, num in h]
