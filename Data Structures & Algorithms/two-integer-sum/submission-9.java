class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> kol = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int difference = target - nums[i];
            if(kol.containsKey(difference)){
                return new int[]{kol.get(difference), i};
            }

            kol.put(nums[i],i);
        }
        return new int[]{};
    }
}
