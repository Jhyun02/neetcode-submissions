class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates,0,target,0,new ArrayList<>(), ans);

        return ans;
    }

    private void backtrack(int[] candidates, int start, int target, int sum, List<Integer> k, List<List<Integer>> ans){
        if(sum==target){
            ans.add(new ArrayList<>(k));
            return;
        }
        if(sum>target){
            return;
        }
        for(int i=start; i<candidates.length; i++){
            if(sum+candidates[i]>target){
                break;
            }
            if(i>start && candidates[i-1] == candidates[i]){
                continue;
            }
            k.add(candidates[i]);
            backtrack(candidates,i+1,target,sum+candidates[i],k,ans);
            k.remove(k.size()-1);
        }
    }
}
