class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] Merged = new int[nums1.length + nums2.length];
        for(int i = 0; i < nums1.length; i++){
            Merged[i] = nums1[i];
        }
        for(int i = 0; i < nums2.length; i++){
            Merged[nums1.length + i] = nums2[i];
        }
        Arrays.sort(Merged);
        
        if(Merged.length % 2 != 0){
            return Merged[Merged.length / 2];
        }else{
            int mid = Merged.length/2;
            return (Merged[mid] + Merged[mid - 1]) / 2.0;
        }       
    }
}
