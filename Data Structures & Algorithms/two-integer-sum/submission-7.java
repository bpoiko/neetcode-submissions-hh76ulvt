class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> wowie = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(wowie.containsKey(target-nums[i])){
                return new int[] {wowie.get(target-nums[i]), i};
            }

            wowie.put(nums[i],i);
        }
        return new int[]{};
    }
}
