class Solution {

    public int maxProfit(int[] prices) {
 
 /* 
        //Approach1 -- TC:O(N) SC:O(N)
        Stack<Integer> st = new Stack<>();
        int max = 0;
        st.push(prices[0]);
        for(int i=1;i<prices.length;i++){
            if(prices[i] < st.peek()){
                st.pop();
                st.push(prices[i]);
            }
            else{
                max = Math.max(max,prices[i]-st.peek());
            }
        }
        return max;
*/
        //Approach2 -- TC:O(N) SC:O(1)
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            min = Math.min(min,prices[i]);
            max = Math.max(max,prices[i]-min);
        }
        return max;       
    }
}