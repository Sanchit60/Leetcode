class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        HashMap<Character, Integer> freq = new HashMap<>();
        int max = 0;
        while(j < s.length()){
            char chj = s.charAt(j);
            freq.put(chj, freq.getOrDefault(chj, 0) + 1);
            while(freq.get(chj) > 1){
                char chi = s.charAt(i);
                freq.put(chi, freq.get(chi) - 1);
                i++;
            }
            max = Math.max(max, j - i + 1);
            j++;
        }
        return max;
        
    }
}
