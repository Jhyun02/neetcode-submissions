class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                int prevIndex = map.get(diff);

                return new int[]{prevIndex,i};
            }

            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
