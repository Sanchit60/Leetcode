class StockSpanner {
    Stack<int[]> st;
    int day;
    
    public StockSpanner() {
        st = new Stack<>();
        day = 0;        
    }
    
    public int next(int price) {
        while(st.size() > 0 && price >= st.peek()[1]){
            st.pop();
        }
        int span = -1;
        if(st.size() == 0){
            span = day - (-1);
        } else{
            span = day - st.peek()[0];
        }
        int [] arr = {day, price};
        st.push(arr);
        day++;
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
