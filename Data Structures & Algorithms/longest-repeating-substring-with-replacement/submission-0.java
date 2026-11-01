class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> count = new HashMap<>();
        int solu = 0;
        int l = 0, maxf = 0;
        for(int r = 0; r < s.length(); r++){
            count.put(s.charAt(r),count.getOrDefault(s.charAt(r),0)+1);
            maxf = Math.max(maxf,count.get(s.charAt(r)));

            while((r-l +1 ) - maxf > k){
                count.put(s.charAt(l), count.get(s.charAt(l))-1);
                l++;
            }
            solu = Math.max(solu, r-l + 1);
        }
        return solu;
    }
}
