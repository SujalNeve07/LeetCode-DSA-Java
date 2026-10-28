class Solution {
    public void moveZeroes(int[] nums) {

        int index=0;

        for(int value:nums)
        {
            if(value !=0)
            {
                nums[index] = value;
                index++;
            }
        }

        while(index < nums.length)
        {
            nums[index] = 0;
            index++;
        }
        
        System.out.println(Arrays.toString(nums));
    }
}