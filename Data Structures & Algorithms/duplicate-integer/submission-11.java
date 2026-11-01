class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> look = new HashSet<>();
        for(int num : nums){
            if(look.contains(num)){
                return true;
            }
            look.add(num);
        }
        return false;
    }
}