class NumArray {
    int[] arr;
    int[] pSum;

    public NumArray(int[] nums) {
        this.arr = nums;
        this.pSum = new int[nums.length];
        pSum[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            pSum[i] = pSum[i-1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        int leftPSum = left == 0 ? 0 : pSum[left - 1];
        int rightPSum = pSum[right];
        return rightPSum - leftPSum;        
    }
}
