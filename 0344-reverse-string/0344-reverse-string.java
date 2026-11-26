class Solution {
    public void reverseString(char[] s) {

        String rev = "";
        String str = new String(s);
       
        for(int i = str.length()-1;i>=0;i--)
        {
            rev = rev + str.charAt(i);
        }
         for(int i=0;i<s.length;i++)
         {
            s[i] = rev.charAt(i);
         }

        
        
        
    }
}