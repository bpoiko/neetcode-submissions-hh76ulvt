class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> seen;
        for(int i = 0; i < nums.size(); i++){
            int k = target - nums[i];
            if (seen.count(k)) return {seen[k], i};
            seen[nums[i]] = i;
        }
        return{};
    }
};
