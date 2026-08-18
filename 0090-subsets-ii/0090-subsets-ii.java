class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums,0,ans,new ArrayList<>());
        return ans;
    }

    public void backtrack(int[] nums, int start, List<List<Integer>> ans, List<Integer> curr)
    {
        if(ans.contains(curr))
        {
            return;
        }

        ans.add(new ArrayList<>(curr));

        for(int i=start;i<nums.length;i++)
        {
            // skip the duplicate elemennts
                // if(i>start && nums[i]==nums[i-1])
                // {
                //     continue;
                // }

            // pick
            curr.add(nums[i]);
            //explore
            backtrack(nums,i+1,ans,curr);
            //not pick
            curr.remove(curr.size()-1);
        }
    }
}