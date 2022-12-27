class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        //Approach1 -- TC:O(N*M) SC:O(N*M)
        int rs = 0;
        int re = matrix.length-1;
        int cs = 0;
        int ce = matrix[0].length-1;

        List<Integer> ans = new ArrayList<>();
        while(rs <= re && cs <= ce){
            for(int i=cs;i<=ce;i++){
                ans.add(matrix[rs][i]);
            }
            rs++;
            if(rs>re || cs> ce){
                break;
            }

            for(int i=rs;i<=re;i++){
                ans.add(matrix[i][ce]);
            }
            ce--;
            if(rs>re || cs> ce){
                break;
            }

            for(int i=ce;i>=cs;i--){
                ans.add(matrix[re][i]);
            }
            re--;
            if(rs>re || cs> ce){
                break;
            }

            for(int i=re;i>=rs;i--){
                ans.add(matrix[i][cs]);
            }
            cs++;
            if(rs>re || cs> ce){
                break;
            }
        }
        return ans;
    }
}