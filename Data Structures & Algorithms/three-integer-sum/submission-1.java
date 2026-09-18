class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    int left;
    int right;
    int mid;
    int n = nums.length;

    List<List<Integer>> ans = new ArrayList<>();

    Arrays.sort(nums);

    for(left=0; left<n; left++){

        mid=left+1;
        right=n-1;

        if(left > 0 && nums[left] == nums[left-1]){
                    continue;
            }

        while(mid<right){
            
            if(nums[left] + nums[right] + nums[mid] == 0){
                List<Integer> list = new ArrayList<>();
                
                list.add(nums[left]);
                list.add(nums[mid]);
                list.add(nums[right]);
                ans.add(list);

                mid++;
                right--;

                while (mid < right && nums[mid] == nums[mid-1]) {
                    mid++;
                }
                while (mid < right && nums[right] == nums[right+1]) {
                    right--;
                }
                
                continue;
            }
            else if(nums[left] + nums[right] + nums[mid] > 0){
                right--;
                continue;
            }
            else if(nums[left] + nums[right] + nums[mid] < 0){
                mid++;
                continue;
            }
        }
    }

    return ans;
    
    }
}
