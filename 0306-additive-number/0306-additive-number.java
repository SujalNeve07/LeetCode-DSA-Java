
import java.math.*;
class Solution {
    public boolean isAdditiveNumber(String num) {
        int n = num.length();
        for(int i=1; i<n;i++){
           for(int j=i+1;j<n;j++)
           {
            String a = num.substring(0,i); 
            String b = num.substring(i,j);

            // Leading zeros
            if(a.length()> 1 && a.charAt(0)=='0' )
            {
                continue;
            }
            if(b.length()>1 && b.charAt(0)=='0')
            {
                continue;
            }

            BigInteger x = new BigInteger(a);
            BigInteger y = new BigInteger(b);
            if(helper(num,j,x,y))
            {
                return true;
            }
           } 
        }
        return false;

    }
    public boolean helper(String num, int index, BigInteger x, BigInteger y)
    {
       // base case
        if(index==num.length())
        {
            return true;
        }

        BigInteger sum =x.add(y);
        String s = ""+sum;

        if (!num.startsWith(s, index))
            return false;

        return helper(num, index + s.length(), y, sum);
    }
}