class Solution {
    private boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }    
    public int maxVowels(String s, int k) {
        int maxCount = 0;
        int count = 0;
        for(int i = 0; i < k; i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        maxCount = count;
        for(int i = k; i < s.length(); i++){
            if(isVowel(s.charAt(i-k))){
                count--;
            }
            if(isVowel(s.charAt(i))){
                count++;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}
