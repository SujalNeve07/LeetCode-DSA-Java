class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        // Store all the character in Hashset
        HashSet<Character>  set = new HashSet<>();

        for(char ch: jewels.toCharArray())
        {
            // sarve set madhe apan add kartoy
            set.add(ch);
        }

        // check each stone and count the matches
        int count =0;
        for(char ch:stones.toCharArray())
        {
            if(set.contains(ch))
            {
                count++;
            }
        }
        return count;
    }
}