class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        List<Integer> uniqueNums = new ArrayList<>();
        uniqueNums.add(nums[0]);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                uniqueNums.add(nums[i]);
            }
        }
        for(int i = 0; i < uniqueNums.size(); i++){
            nums[i] = uniqueNums.get(i);
        }
        return uniqueNums.size();
        
    }
}
