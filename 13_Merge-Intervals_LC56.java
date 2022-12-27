class Solution {
    public int[][] merge(int[][] intervals) {
        
         //Approach1 -- TC:O(NlogN) SC:O(N)
        List<int[]> ls = new ArrayList<>();
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        int helper[] = intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=helper[1]){
                helper[1] = Math.max(helper[1],intervals[i][1]);
            }
            else{
                ls.add(helper);
                helper = intervals[i];
            }
        }
        ls.add(helper);
        return ls.toArray(new int[ls.size()][]);
    }
}