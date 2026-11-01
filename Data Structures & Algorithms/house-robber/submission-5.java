class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        int[] fe = new int[nums.length];
        fe[0] = nums[0];
        fe[1] = Math.max(nums[0],nums[1]);
        for(int i = 2; i < nums.length; i++){
            fe[i] = Math.max(fe[i - 1], nums[i] + fe[i-2]);
        }
        return fe[nums.length -1];
    }
}
