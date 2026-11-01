class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numa = new HashMap<>();
//key value
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(numa.containsKey(target - nums[i])){
                return new int[]{numa.get(target-nums[i]),i };
            }
            numa.put(nums[i], i);
        }
        return new int[]{};
    }
}
