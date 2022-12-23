class Solution {
    
    public int pivotIndex(int[] nums) {
/*
        //Approach1 -- TC:O(N) SC:O(1)
        int totalSum = 0;
        for(int i=0;i<nums.length;i++){
            totalSum += nums[i];
        }

        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(2*sum == totalSum + nums[i]){
                return i;
            }
        }
        return -1;
*/
        //Approach1 -- TC:O(N) SC:O(1)
        int totalSum = 0;
        for(int i=0;i<nums.length;i++){
            totalSum += nums[i];
        }

        int sum = 0;
        for(int i=0;i<nums.length;i++){
            totalSum -= nums[i];
            if(totalSum == sum){
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }
}