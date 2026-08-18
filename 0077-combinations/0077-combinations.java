class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(n,k,ans,new ArrayList<>());
        return ans;

        
    }

    public void backtrack(int n, int k,List<List<Integer>> ans , List<Integer> curr)
    {
        if(k==0)
        {
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(n==0)
        {
            return;
        }

        // pick
        curr.add(n);
        backtrack(n-1,k-1,ans,curr);

        // not pick
        curr.remove(curr.size()-1);
        backtrack(n-1,k,ans,curr);
    }
}