class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int l = 0;
        int length = 0;
        for(int window = 0; window < s.length(); window++){
            while(seen.contains(s.charAt(window))){
                seen.remove(s.charAt(l));
                l++;
            }
            seen.add(s.charAt(window));
            length = Math.max(length, (window-l) + 1);
        }
        return length;
    }
}
