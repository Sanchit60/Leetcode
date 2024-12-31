class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int lo = 0;
        int hi = rows * cols - 1;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            int midVal = matrix[mid/cols][mid%cols];
            if(midVal == target){
                return true;
            } else if(midVal < target){
                lo = mid + 1;
            } else{
                hi = mid - 1;
            }
        }
        return false;
        
    }
}
