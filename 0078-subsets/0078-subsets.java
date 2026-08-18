class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums,0,new ArrayList<>(),ans);
        return ans;
    }

    public void backtrack(int[] nums,int start,List<Integer> curr,List<List<Integer>> ans)
    {
        // Every current subset is a valid answer
        ans.add(new ArrayList<>(curr));

        for(int i=start; i<nums.length;i++)
        {
            // choose
            curr.add(nums[i]);
            // explore
            backtrack(nums,i+1,curr,ans);
            //backtrack
            curr.remove(curr.size()-1);
            
        }
    }
}