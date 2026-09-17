class Solution {
    public boolean isPalindrome(String s) {
        int size = s.length();
        int left = 0;
        int right = size-1;

        while(left <= right){
            char c = s.charAt(left);
            char c2 = s.charAt(right);

            if(!Character.isLetterOrDigit(c)){
                left++;
                continue;
            }
            else if (!Character.isLetterOrDigit(c2)){
                right--;
                continue;
            }
            if(Character.toLowerCase(c)!=Character.toLowerCase(c2)){
                return false;
            }
            left++;
            right--;
            

        }

        return true;
    }
}
