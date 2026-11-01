class Solution {
    public boolean isAnagram(String s, String t) {
        if(t.length() > s.length()){
            return false;
        }
        char[] b1 = s.toCharArray();
        char[] b2 = t.toCharArray();
        Arrays.sort(b1);
        Arrays.sort(b2);
        return Arrays.equals(b1,b2);
    }
}
