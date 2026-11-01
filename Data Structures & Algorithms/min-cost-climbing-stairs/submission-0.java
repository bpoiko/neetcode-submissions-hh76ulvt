class Solution {
    public int minCostClimbingStairs(int[] cost) {
        return Math.min(costFind(cost,0), costFind(cost,1));
    }
    public int costFind(int[]b1,int i ){
        if(i >= b1.length){
            return 0;
        }

        return b1[i] + Math.min(costFind(b1,i+1),costFind(b1,i+2));
    }
}
