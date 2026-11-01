class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int z = temperatures.length;
        int[]awesome = new int[temperatures.length];

        for(int i = 0; i < z; i++){
            int count = 1;
            int j = i + 1;
            while(j < z){
                if(temperatures[j] > temperatures[i]){
                        break;
                }
                j++;
                count++;
            }
            count = (j==z) ? 0 : count;
            awesome[i] = count;
        }
        return awesome;
    }
}
