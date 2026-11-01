class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] bab = new int[temperatures.length];
        Stack<int[]> jum = new Stack<>();

        for(int i = 0; i < temperatures.length; i++){
            int temp = temperatures[i];

            while(!jum.isEmpty() && temp > jum.peek()[0]){
                int[] pair = jum.pop();
                bab[pair[1]] = i - pair[1];
            }
            jum.push(new int[]{temp,i});
        }
        return bab;
    }
}
