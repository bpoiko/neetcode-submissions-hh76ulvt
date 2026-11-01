class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> check = new HashSet<>();
        for(int n : nums){
            if(!check.add(n)){
                return true;
            }
            check.add(n);
        }
        return false;
    }
}