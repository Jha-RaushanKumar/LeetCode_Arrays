class Solution {
    public void sortColors(int[] nums) {
        
        //Approach1 -- TC:O(N) SC:O(1)
        int i = 0;
        int j = nums.length-1;
        int k = 0;

        while(i<=j){
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                i++;
                k++;
            }
            else if(nums[i] == 2){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
            else{
                i++;
            }
        }
    }
}