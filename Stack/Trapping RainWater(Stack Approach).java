class Solution {
    public int trap(int[] height) {
        // We are going to use the Stack approach
        Stack<Integer> st = new Stack<>();
        int waterLogged = 0;
        for(int i = 0; i < height.length; i++){
            while(st.size() > 0 && height[i] > height[st.peek()]){
                int minIdx = st.pop();
                if(st.size() == 0){
                    break;
                }
                int left = height[st.peek()];
                int right = height[i];
                int finalheight = Math.min(left, right) - height[minIdx];
                waterLogged += finalheight * (i - st.peek() - 1);                
            }
            st.push(i);
        }
        return waterLogged;      
    }
}
