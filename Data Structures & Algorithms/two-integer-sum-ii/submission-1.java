class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int size = numbers.length;
        int left = 0;
        int right = size-1;
        int[] ans = new int[2];

        while(left < right){
            if(numbers[left] + numbers[right] > target){
                right--;
                continue;
            }
            else if(numbers[left] + numbers[right] < target){
                left++;
                continue;
            }
            else if(numbers[left] + numbers[right] == target){
                ans[0]=left+1;
                ans[1]=right+1;
                break;
            }
            
        }

        return ans;





    }
}
