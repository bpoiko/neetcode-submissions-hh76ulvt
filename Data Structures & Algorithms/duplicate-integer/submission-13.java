class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hei = new HashSet<>();
        for(int num : nums){
            hei.add(num);
        }
        return hei.size() != nums.length;
    }
}