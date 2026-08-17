class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        backtrack(resultList,new ArrayList<>(),nums);
        return resultList;

        
    }

    public void backtrack(List<List<Integer>> resultList, ArrayList<Integer> tempList, int[] nums)
    {

        // Base case: if we match the length of the arraylist then it is a permutation
        if(tempList.size()==nums.length)
        {
            resultList.add(new ArrayList<>(tempList));
            return;
        }

        for(int number : nums)
        {

            // skip if we get same element
            if(tempList.contains(number))
            {
                continue;
            }
           // Add the new element
            tempList.add(number);

            // Go back to try the other element
            backtrack(resultList,tempList,nums);

            //Remove the added element to try another permutation
            tempList.remove(tempList.size()-1);
            
        }
    }
}                