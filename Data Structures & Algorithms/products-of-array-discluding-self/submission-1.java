class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            int prod = 1;
            for(int j = 0; j < n; j++){
                if(i != j){
                    prod *= nums[j]; // we know that i isn't included as i ISNT equal to J
                }
            }
            res[i] = prod;
        }
        return res;
    }
}  
