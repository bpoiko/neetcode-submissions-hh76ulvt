class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numba = new HashSet<>();
        for(int num : nums){
            numba.add(num);
        }
        int longest = 0;
        for(int num : numba){

            if(!numba.contains(num-1)){
                int length = 1;
                while(numba.contains(num + length)){
                    length++;
                }
                longest = Math.max(longest,length);
            }
        }
        return longest;
    }
}
