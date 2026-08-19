class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return backtrack(nums,target,0,0);
        
    }

    public int backtrack(int[] nums, int target, int index, int sum)
    {
        // Base Case 
        if(index == nums.length)
        {
            if(sum==target)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }

        // Choice 1: Add
        int add = backtrack(nums,target,index+1,sum+nums[index]);

        // Choice 2: Subtract
        int subtract = backtrack(nums,target,index+1,sum-nums[index]);

        return add+subtract;
    }
}