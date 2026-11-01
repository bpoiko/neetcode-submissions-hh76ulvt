class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int sol = nums[0]; 
        while(l <= r){
            if(nums[l] < nums[r]){
                sol = Math.min(sol, nums[l]);
                break;
            }

            int mid = l + (r-l) / 2;
            sol = Math.min(sol, nums[mid]);
            if(nums[mid] >= nums[r]){
                l = mid + 1; // answer cant be on the left side
            }else{
                r = mid - 1;
            }
        }
        return sol;
    }
}
