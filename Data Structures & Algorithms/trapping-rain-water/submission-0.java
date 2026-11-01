class Solution {
    public int trap(int[] height) {
         // one block of water min(left bound, right bound) determines how much water, min(L,R) - h[i] so, 1 -2 = -1 however neg water doesnt make sense, if <0 no water
         if(height == null || height.length == 0){
            return 0;
         }
        int left = 0, right = height.length -1;
        int leftMax = height[left], rightMax = height[right];
        int res = 0;
        while(left < right){
            if(leftMax < rightMax){
                left += 1;
                leftMax = Math.max(leftMax,height[left]);
                res += leftMax - height[left];
            }else{
                right -= 1;
                rightMax = Math.max(rightMax,height[right]);
                res += rightMax - height[right];
            }
        }
        return res;
    }
}
