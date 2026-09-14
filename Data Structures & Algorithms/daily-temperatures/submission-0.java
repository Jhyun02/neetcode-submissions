class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
    
        Deque<Integer> stack = new ArrayDeque<>();
        int len = temperatures.length;
        int max = 0;
        int idx = 0;

        int[] ans = new int[len];


        for(int i=0; i<len; i++){
            
            while(!stack.isEmpty() && temperatures[i] >temperatures[stack.peek()]){
                idx = stack.pop();
                ans[idx] = i - idx;

            }
            stack.push(i);
        }

        return ans;
    }
}
