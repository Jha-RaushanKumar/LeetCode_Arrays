class Solution {
	
    public int[] sortedSquares(int[] nums) {

/*
        //Approach1 -- TC:O(N + NlogN) SC:O(N)
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
*/

        //Approach2 -- TC:O(N) SC:O(N)
        int i = 0;
        int j = nums.length-1;
        int ans[] = new int[j+1];
        int k = j;
        while(i<=j){
            if(Math.abs(nums[j]) >= Math.abs(nums[i])){
                int num = nums[j]*nums[j];
                ans[k] = num;
                j--;
                k--;
            }
            else{
                int num = nums[i]*nums[i];
                ans[k] = num;
                i++;
                k--;
            }
        }
        return ans;        
    }
}