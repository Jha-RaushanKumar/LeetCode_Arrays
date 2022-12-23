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
                max += prices[i]-st.peek();
                st.push(prices[i]);
            }
        }
        return max;
*/
        //Approach2 -- TC:O(N) SC:O(1)
        int max = 0;
        for(int i=0;i<prices.length-1;i++){

            while(i<prices.length-1 && prices[i] > prices[i+1]){
                i++;
            }
            int buy = prices[i];
            while(i<prices.length-1 && prices[i] < prices[i+1]){
                i++;
            }
            int sell = prices[i];

            max += sell-buy;

        }
        return max;
        
    }
}