class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet vals = new HashSet<>();
        for(int num : nums){
            if(!vals.add(num)){
                return true;
            }
            vals.add(num);
        }
        return false;
    }
}