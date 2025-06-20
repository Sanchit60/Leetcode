class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int prevVal1 = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int val1 = nums[i];
            if(val1 == prevVal1){
                continue;
            }
            prevVal1 = val1;
            int nTar = 0 - val1;
            int st = i + 1;
            int en = nums.length - 1;
            int prevSt = Integer.MIN_VALUE;
            int prevEn = Integer.MAX_VALUE;
            while(st < en){
                int currSt = nums[st];
                int currEn = nums[en];
                int sum = currSt + currEn;
                if(sum < nTar){
                    st++;
                } else if(sum > nTar){
                    en--;
                } else{
                    if(prevSt == currSt && prevEn == currEn){
                        st++;
                        en--;
                        continue;
                    }
                    
                    prevSt = currSt;
                    prevEn = currEn;
                    st++;
                    en--;
                    List<Integer> triplets = new ArrayList<>();
                    triplets.add(val1);
                    triplets.add(currSt);
                    triplets.add(currEn);
                    list.add(triplets);
                }
            } 
        }
        return list;
        
    }
}
