class Solution {
    public String smallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        char[] ans = new char[arr.length];
        int left = 0;
        int right =arr.length-1;
        int i=0;
        while(i<arr.length)
        {
            if(i==arr.length-1 || arr[i] != arr[i+1])
            {
                ans[arr.length/2] = arr[i];
                i++;
            }
            else
            {
                ans[left++] = arr[i];
                ans[right--] = arr[i];
                i += 2;
            }
        } 
        return new String(ans);
    }
}