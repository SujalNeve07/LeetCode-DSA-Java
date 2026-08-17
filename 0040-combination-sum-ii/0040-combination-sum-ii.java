class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        // Sort the array
        Arrays.sort(candidates);
        backtrack(candidates,target,0,new ArrayList<>(),ans);
        return ans;
        
    }


    public void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> ans)
    {   
        // If target is 0 then simply return the current empty arraylist
        if(target==0)
        {
            ans.add(new ArrayList<>(current));
            return;
        }

        // if target is not zero then traverse through the list
        for(int i= start; i<candidates.length;i++)
        {
            // Skip the duplicates
            if(i>start && candidates[i]==candidates[i-1])
            {
                continue;
            }

            // early termination if the remaining sum beocmes negative
            if(target-candidates[i] < 0)
            {
                break;
            }
            current.add(candidates[i]);
            backtrack(candidates,target-candidates[i],i+1,current,ans);
            current.remove(current.size()-1);
        }

    }
}