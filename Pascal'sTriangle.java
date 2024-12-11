class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> zerothLi = new ArrayList<>();
        zerothLi.add(1);
        ans.add(zerothLi);
        if(numRows == 1){
            return ans;
        }
        List<Integer> firstLi = new ArrayList<>();
        firstLi.add(1);
        firstLi.add(1);
        ans.add(firstLi);

        for(int row = 2; row < numRows; row++){
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            List<Integer> prev = ans.get(row - 1);
            for(int j = 0; j < prev.size() - 1; j++){
                int val1 = prev.get(j);
                int val2 = prev.get(j+1);
                int sum = val1 + val2;
                curr.add(sum);
          
            }
            curr.add(1);
        
            ans.add(curr);
        }
        return ans;
       
    }
}
