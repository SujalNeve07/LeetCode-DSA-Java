class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(resultList, new ArrayList<>(),new ArrayList<>(), nums);
        return resultList;
        
    }

    public void backtrack(List<List<Integer>> resultList, ArrayList<Integer> tempList,List<Integer> usedIndices, int[] nums)
    {

        // Base case 
            if (tempList.size() == nums.length)
            {
                resultList.add(new ArrayList<>(tempList));
                return;
            }
        

        HashSet<Integer> set = new HashSet<>();

        for(int number=0; number<nums.length;number++)
        {
            // Skip if this index has already been used in the current path
            if (usedIndices.contains(number)) {
                continue;
            }

            // duplicate choice at same level
            if(set.contains(nums[number]))
            {
                continue;
            }
            set.add(nums[number]);
            //Add new element
            tempList.add(nums[number]);
            usedIndices.add(number);
            
            // Go back to try the other element
            backtrack(resultList,tempList,usedIndices,nums);

            //Remove the added element to try another permutation
            tempList.remove(tempList.size()-1);
            usedIndices.remove(usedIndices.size()-1);

        }
    }
}