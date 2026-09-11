class Solution {
    public boolean canJump(int[] nums) {
        int maxstep =0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>maxstep)
            {
                return false;
            }

            maxstep = Math.max(maxstep,i+nums[i]);
            if(maxstep==nums.length-1)
            {
                return true;
            }

        }
        return true;   
    }
}