class Solution {
    public int[] productExceptSelf(int[] nums) {

        // Array to store left mulitplication
        int[] left = new int[nums.length];
        // Array to store right multiplication
        int[] right = new int[nums.length];

        left[0] = 1;
        // start from beginning there is no element before 1st element so we consider it as 1 
        for(int i=1;i<nums.length;i++)
        {
            // left to right
            left[i] = left[i-1] * nums[i-1];
        }
        // start from enf there is no eleemt after the last element so we consider it as 1 
        right[nums.length-1] = 1;

        // right to left
        for(int i= nums.length-2 ; i>=0;i--)
        {
            right[i] = right[i+1] * nums[i+1];
        }

        // create new answer array
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i] = left[i] * right[i];
        }
        return ans;
    }
}