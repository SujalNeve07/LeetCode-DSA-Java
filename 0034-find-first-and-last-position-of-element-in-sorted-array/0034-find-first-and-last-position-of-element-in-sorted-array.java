class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 1 && nums[0] == target) return new int[] {0, 0};
       int first1 = first(nums,target);
       int sec1 = last(nums,target);

       return new int[] {first1,sec1};
         
        
    }

    public int first(int[] nums,int target){

        int s = 0;
        int e = nums.length-1;
        int ans = -1;
        while(s<=e)
        {
            int mid = s +(e-s)/2;
            if(target == nums[mid])
            {
                ans = mid;
                e = mid-1;
            }
            else if(nums[mid] > target)
            {
                e = mid-1;
            }

            else
            {
                s = mid+1;
            }
        }

        return ans;
    }


        public int last(int[] nums,int target){

        int s = 0;
        int e = nums.length-1;
        int ans = -1;
        while(s<=e)
        {
            int mid = s +(e-s)/2;
            if(target == nums[mid])
            {
                ans = mid;
                s = mid+1;
            }
            else if(nums[mid] > target)
            {
                e = mid-1;
            }

            else
            {
               s = mid+1;
            }
        }

        return ans;
    }
}