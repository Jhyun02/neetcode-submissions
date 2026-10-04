class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int[] nums, int start, List<Integer> subset, List<List<Integer>> ans){
        ans.add(new ArrayList<>(subset));

        for(int i=start; i<nums.length; i++){
            if(i>start && nums[i] == nums[i-1]){
                continue;
            }
            subset.add(nums[i]);
            backtrack(nums, i+1, subset, ans);
            subset.remove(subset.size()-1);
        }


    }
}
