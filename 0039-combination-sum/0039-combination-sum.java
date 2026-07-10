class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(candidates,target,0,new ArrayList<>(),ans);
        return ans;

    }

    public void backtrack(int[] candidates, int target, int index, List<Integer> temp, List<List<Integer>> ans)
    {
        // base case

        if(target==0)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }

        if(target<0 || index == candidates.length)
        {
            return;
        }

        // Choose current element
        temp.add(candidates[index]);

        // reuse of element is allowed
        backtrack(candidates,target-candidates[index],index,temp,ans);
        temp.remove(temp.size()-1);

        // element excluded
        backtrack(candidates,target,index+1,temp,ans);
    }
}