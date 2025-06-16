//Instead of comparing all pairs:

//Fix i to be the minimum element seen so far.

//Move j forward one by one.

//At each step, ask:

//Is nums[j] > minSoFar? ✔ Then calculate the difference.

//If nums[j] < minSoFar, update minSoFar — because it might be a better candidate for future pairs.

//CODE:

class Solution {
    public int maximumDifference(int[] nums) {
        int minsofar = nums[0];
        int maxDiff = -1;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] > minsofar){
                int diff = nums[j] - minsofar;
                maxDiff = Math.max(maxDiff, diff);
            }
            else{
                minsofar = nums[j];
            }
        }
        return maxDiff;
        
    }
}
