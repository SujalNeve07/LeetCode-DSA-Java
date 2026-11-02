class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int left = 0;
        int right = nums.length-1;

        while(left<right)
        {
            // If left is even
            if(nums[left]%2==0)
            {
                left++;
            }
            // If right is odd
           else if(nums[right]%2 != 0)
            {   
                right--;
            }

            // if left is odd and right is even then swap the numbers   
            else
            {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        return nums;
        
    }
}