class Solution {
    public int findNthDigit(int n) {
        long digit = 1;
        long count = 9;
        long start = 1;
        
        // finding digit length group
        while(n>digit*count)
        {
            n-= digit*count;
            digit++;
            count *= 10;
            start *= 10;
        }
        // finding the actual number
        long num = start+(n-1)/digit;
        // finding th digit inside that number
        int index = (int) ((n-1)%digit);

        return String.valueOf(num).charAt(index)-'0';
        
    }
}