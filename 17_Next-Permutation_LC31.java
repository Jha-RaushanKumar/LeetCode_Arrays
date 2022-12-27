class Solution {
    public void nextPermutation(int[] nums) {
        
        //Approach1 -- TC:O(N) SC:O(1)
        int i = nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        int j = nums.length-1;
        if(i>=0){
            while(j>=0 && nums[i]>=nums[j]){
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        reverse(nums,i+1,nums.length-1);
        
    }

    public void reverse(int[] nums, int i, int j){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}