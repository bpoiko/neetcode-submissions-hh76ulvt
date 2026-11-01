class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length <= 1) return nums;

        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : nums) freq.put(x, freq.getOrDefault(x, 0) + 1); // first time => 1

        // min-heap by frequency
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        for (Map.Entry<Integer,Integer> e : freq.entrySet()) {
            pq.offer(new int[]{e.getKey(), e.getValue()});
            if (pq.size() > k) pq.poll(); // keep only top k by popping smallest
        }

        int[] ans = new int[k];
        int i = 0;
        while (!pq.isEmpty()) ans[i++] = pq.poll()[0]; // any order is fine
        return ans;
    }
}

