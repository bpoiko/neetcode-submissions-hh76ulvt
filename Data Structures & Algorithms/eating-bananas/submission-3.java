class Solution{
    public int minEatingSpeed(int[] piles, int h){
        int l = 0;
        int r = Arrays.stream(piles).max().getAsInt();
        int res = r;
        while(l <= r){
            int k = (l+r) / 2;
            long totalTime = 0;
            for(int nana : piles){
                totalTime += (int) Math.ceil((double) nana / k); // banana divided by current eating speed
            }
            if(totalTime <= h){
                res = k;
                r = k -1;
            }else{
                // too slow
                l = k + 1;
            }
        }
        return res;
    }
}