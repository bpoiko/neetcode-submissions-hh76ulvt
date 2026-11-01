class Solution {
    /**
     * @param {number[]} numbers
     * @param {number} target
     * @return {number[]}
     * 
     * 
     * 
     * Input - Sorted Array of Integers + or -
     * Output - 1-indexed of the two numbers that add up to the target
     * 
     * Test case
     * nums = [2,3,4,10, 100, 101];
     * target = 14
     * return [3,4]
     */
    twoSum(nums, target) {
        let head = 0
        let tail = nums.length -1;
        let difference = target - (nums[head] + nums[tail])
        while(nums[head] + nums[tail] != target){
            if(difference > 0){
                head++;
            }
            if(difference < 0){
                tail--;
            }
            difference = target - (nums[head] + nums[tail])
        }
        return[head+1,tail+1].sort((a,b) => {return a-b});
    }
}
