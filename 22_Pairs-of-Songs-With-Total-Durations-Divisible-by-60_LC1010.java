class Solution {
    public int numPairsDivisibleBy60(int[] time) {

        //Approach1 -- TC:O(N) SC:O(N)
        int count = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<time.length;i++){
            count += hm.getOrDefault((60-time[i]%60)%60,0);
            hm.put(time[i]%60, hm.getOrDefault(time[i]%60,0)+1);
        }
        return count;
        
    }
}