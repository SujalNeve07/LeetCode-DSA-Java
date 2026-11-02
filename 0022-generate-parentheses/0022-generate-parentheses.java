class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();

        generate(ans,"",0,0,n);
        return ans;
    }

    public void generate(List<String> ans,String s , int open, int close, int n)
    {
        // Base Case
        if(s.length()==2*n)
        {
            ans.add(s);
        }

        // Ithe apan opening bracket add karto
        if(open<n)
        {
            generate(ans,s+"(",open+1,close,n);
        }

        // Ithe closing bracket add karto
        if(close<open)
        {
            generate(ans,s+")",open,close+1,n);
        }
    }
}