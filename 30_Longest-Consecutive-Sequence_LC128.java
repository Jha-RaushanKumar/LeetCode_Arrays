class Solution {
    public int longestConsecutive(int[] nums) {

        //Approach1 -- TC:O(N) SC:O(N)
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int max = 0;
        for(int i=0;i<nums.length;i++){
            int count = 0;
            int val = nums[i];
            if(!set.contains(val-1)){
                while(set.contains(val)){
                    count++;
                    val++;
                }
                max = Math.max(max,count);
            }
        }
        return max;
        
    }
}