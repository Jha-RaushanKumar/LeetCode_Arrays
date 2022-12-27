class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        //Approach1 -- TC:O(NlogN) SC:O(N)
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int sumClosest  = 0;
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == target){
                    return sum;
                }
                else if(sum>target){
                    k--;
                }
                else{
                    j++;
                }
                if(Math.abs(target-sum)<min){
                    min = Math.abs(target-sum);
                    sumClosest = sum;
                }
            }
        }
        return sumClosest;
    }
}