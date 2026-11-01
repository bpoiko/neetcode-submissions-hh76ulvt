class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> man = new HashSet<>();
        int l = 0;
        int length = 0;
        
        for(int window = 0; window < s.length(); window++){
            while(man.contains(s.charAt(window))){
                man.remove(s.charAt(l));
                l++;
            }
            man.add(s.charAt(window));
            length = Math.max(length, (window - l) + 1);
        }
        return length;
    }
}
