class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] res = new int[k];
        
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        Map<Integer, Integer> checker = new HashMap<>();
        for(int num : nums){
            if(checker.containsKey(num)){
                checker.put(num, checker.get(num)+ 1);
            }else{
                checker.put(num,1);
            }
        }
        
        pq.addAll(checker.entrySet());
        for(int i = 0; i < k; i++){
            res[i] = pq.remove().getKey();
        }
        return res;
    }
}
