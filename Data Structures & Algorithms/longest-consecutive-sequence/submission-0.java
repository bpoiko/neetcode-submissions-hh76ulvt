class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> conseq = new HashSet<>();
        for(int num : nums){
            conseq.add(num);
        }
        int longest = 0;
        for(int num : conseq){
            if(!conseq.contains(num - 1)){
                int length = 1;
                while(conseq.contains(num + length)){
                    length++;
                }
                longest = Math.max(longest,length);
            }
        }
        return longest;
    }
}
