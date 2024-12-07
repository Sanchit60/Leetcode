class Solution {
    String [] arr = {" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    List<String> ans = new ArrayList<>(); 

    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return new ArrayList<>();
        }
        generateCombination(digits, "");
        return ans;
             
        
    }

    public void generateCombination(String digits, String asf){
        if(digits.length() == 0){
            ans.add(asf);
            return;
        }
        int digit = digits.charAt(0) - '0';
        String digitComb = arr[digit];
        String ros = digits.substring(1);
        for(int i = 0; i < digitComb.length(); i++){
            char ch = digitComb.charAt(i);
            generateCombination(ros, asf + ch);
        }
    }
}
