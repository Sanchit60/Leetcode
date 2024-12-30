class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        int foi = -1;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(nums[mid] == target){
                hi = mid - 1;
                foi = mid;
            } else if(nums[mid] < target){
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
            
        }
        lo = 0;
        hi = nums.length - 1;
        int loi = -1;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(nums[mid] == target){
                lo = mid + 1;
                loi = mid;
            } else if(nums[mid] < target){
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
            
        }
        int[] ans = {foi, loi};
        return ans;        

    }
}
