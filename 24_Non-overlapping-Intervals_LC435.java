class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
         //Approach1 -- TC:O(NlogN) SC:O(N)
        List<int[]> ls = new ArrayList<>();
        int count = 0;
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        int helper[] = intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<helper[1]){
                helper[1] = Math.min(helper[1],intervals[i][1]);
                count++;
            }
            else{
                helper = intervals[i];
            }
        }
        return count;
    }
}