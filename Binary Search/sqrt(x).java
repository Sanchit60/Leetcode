class Solution {
    public int mySqrt(int x) {
        int lo = 0;
        int hi = x;
        int result = 0;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(x == 0 || x == 1){
                return x;
            }
            if(mid == x/mid){
                return mid;
            }else if (mid < x/mid){
                result = mid;
                lo = mid + 1;
            } else{
                hi = mid - 1;
            }
        }
        return result;
        
    }
}
