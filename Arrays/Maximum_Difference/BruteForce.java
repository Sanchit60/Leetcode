class Solution {
    public int maximumDifference(int[] nums) {
        int difference = -1;
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] > nums[i]){
                    int diff = nums[j] - nums[i];
                    difference = Math.max(difference, diff);
                }
            }
        }
        return difference;
        
    }
}
