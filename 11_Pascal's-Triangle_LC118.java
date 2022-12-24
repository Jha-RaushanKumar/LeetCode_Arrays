class Solution {
    public List<List<Integer>> generate(int numRows) {

        //Approach1 -- TC:O(N^2) SC:O(N)
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> ls = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j== i){
                    ls.add(1);
                }
                else{
                    int val = pre.get(j-1)+pre.get(j);
                    ls.add(val);
                }
            }
            pre = ls;
            ans.add(pre);
        }
        return ans;
        
    }
}