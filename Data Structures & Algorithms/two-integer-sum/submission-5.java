
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hello = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(hello.containsKey(target - num)){
                return new int [] {hello.get(target-num), i};
            }
            hello.put(nums[i], i);
        }
        return new int [] {};
    }
}