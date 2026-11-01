class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 0;
        int r = Arrays.stream(piles).max().getAsInt();
        int rate = r;
        while(l <= r){
            int k = (l+r) / 2;
            long totalTime = 0;
            for(int nana : piles){
                totalTime += (int) Math.ceil((double) nana / k);
            }
            if(totalTime <= h){
                rate = k;
                r = k - 1;
            }else{
                l = k + 1;
            }
        }
        return rate;
    }
}
