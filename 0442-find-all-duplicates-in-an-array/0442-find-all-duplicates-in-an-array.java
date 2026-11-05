class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        // index marking use karun he solve karaycha aahe

        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int idx = Math.abs(nums[i])-1;
            if(nums[idx]<0)
            {
                ans.add(idx+1);
            }

            else
            {
                nums[idx] = -nums[idx];
            }
        }

        return ans;
        
    }
}