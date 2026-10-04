class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permutation(nums, new boolean[nums.length], new ArrayList<>(), ans);
        return ans;
    }

    private void permutation(int[] nums, boolean[] used, List<Integer> k, List<List<Integer>> ans){
        if(k.size() == nums.length){
            ans.add(new ArrayList<>(k));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(used[i]){
                continue;
            }
            used[i]=true;
            k.add(nums[i]);
            permutation(nums, used, k, ans);
            k.remove(k.size()-1);
            used[i]=false;
        }

    }
}
