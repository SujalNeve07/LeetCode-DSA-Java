class Solution {
    public String countAndSay(int n) {

        if(n==1) return "1";

        String res = "1";

        for(int i=2; i<=n ;i++)
        {
            StringBuilder sb = new StringBuilder();
            char[] arr = res.toCharArray();
            // take counter for calculating the frequency
            int count =1;
            for(int j=1; j<arr.length;j++)
            {
                if(arr[j]==arr[j-1]) count++;
                else
                {
                    sb.append(count).append(arr[j-1]);
                    count = 1;
                }
            }

            // Append the last group
            sb.append(count).append(arr[arr.length-1]);
            res = sb.toString();

        }
            return res;       
    }
}