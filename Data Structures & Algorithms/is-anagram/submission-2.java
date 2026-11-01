class Solution {
    public boolean isAnagram(String s, String t) {
        Set<String> map = new HashSet<>();
        char[] hi = s.toCharArray();
        char[] hi2 = t.toCharArray();
        Arrays.sort(hi);
        Arrays.sort(hi2);
        String babble = new String(hi);
        String babble2 = new String(hi2);
        map.add(babble);
        return map.contains(babble2);
    }
}
