class Solution {
    
    public int[] twoSum(int[] nums, int target) {

/*
        //Approach1 -- TC:O(N^2) SC:O(1)
        int ans[] = new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
*/
        //Approach2 -- TC:O(N) SC:O(N)
        int ans[] = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(target - nums[i])){
                ans[0] = hm.get(target-nums[i]);
                ans[1] = i;
                return ans;
            }
            else{
                hm.put(nums[i],i);
            }
        }
        return ans;
    }
}