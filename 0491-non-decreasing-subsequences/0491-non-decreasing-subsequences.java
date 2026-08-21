class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    backtrack(nums,0,ans,new ArrayList<>());
    return ans;
    }

    public void backtrack(int[] nums, int start,List<List<Integer>> ans, List<Integer> curr)
    {
        // if we have atleast 2 elements
        if(curr.size()>=2)
        {
            ans.add(new ArrayList<>(curr));
        }

        Set<Integer> used = new HashSet<>();
        for(int i=start; i<nums.length;i++)
        {
            // skip the duplicates at same level
            if(used.contains(nums[i]))
            {
                 continue;
            }
            
            // Must be non decreasing(Increasing)
            if(curr.isEmpty() || nums[i]>= curr.get(curr.size()-1))
            {
                used.add(nums[i]);

                // pick
                curr.add(nums[i]);
                // explore
                backtrack(nums,i+1,ans,curr);
                // not pick
                curr.remove(curr.size()-1);
            }
        }
    }
}