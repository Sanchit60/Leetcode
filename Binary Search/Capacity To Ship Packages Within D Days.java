class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int weightSum = 0;
        for(int i = 0; i < weights.length; i++){
            weightSum += weights[i];
        }
        int lo = 0;
        int hi = weightSum;
        int min = Integer.MAX_VALUE;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(isWeightAdjusted(weights, days, mid) == true){
                min = Math.min(min, mid);
                hi = mid - 1;
            } else{
                lo = mid + 1;
            }
        }
        return min;
        
    }

    public boolean isWeightAdjusted(int[] weights, int days, int threshold){
        int dayCount = 1;
        int sum = 0;
        for(int i = 0; i < weights.length; i++){
            if(weights[i] > threshold){
                return false;
            }
            if(sum + weights[i] <= threshold){
                sum = sum + weights[i];
            } else {
                sum = weights[i];
                dayCount++;
            }
        }
        return dayCount <= days;
    }
}
