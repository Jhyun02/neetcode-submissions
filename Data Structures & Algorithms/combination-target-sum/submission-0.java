class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, target, 0, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int[] nums, int target, int start, int sum, List<Integer> k, List<List<Integer>> ans){
        
        if(sum==target){
            ans.add(new ArrayList<>(k));
            return;
        }
        if(sum>target){
            return;
        }
        for(int i=start; i<nums.length; i++){
            if (sum + nums[i] > target){ 
                break;
            }
            k.add(nums[i]);
            backtrack(nums, target, i, sum + nums[i], k , ans);
            k.remove(k.size() - 1);
        }


    }
}
