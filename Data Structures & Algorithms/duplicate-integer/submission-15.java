class Solution {
    public boolean hasDuplicate(int[] nums) {
       Set<Integer> hello = new HashSet<>();
       for(int num : nums){
        if(!hello.add(num)){
            return true;
        }
        hello.add(num);
       }
       return false;
    }
}