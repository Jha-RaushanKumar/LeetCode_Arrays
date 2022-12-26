class Solution {
    public int findDuplicate(int[] nums) {

/*        
        //Approach1 -- TC:O(N) SC:O(N)
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],1);
            }
            else{
                return nums[i];
            }
        }
        return 0;
*/
        //Approach2 -- TC:O(N) SC:O(N)
        int freq[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
            if(freq[nums[i]]>1){
                return nums[i];
            }
        }
        return 0;
    }
}