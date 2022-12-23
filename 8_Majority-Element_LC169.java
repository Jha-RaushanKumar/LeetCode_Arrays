class Solution {
    public int majorityElement(int[] nums) {

/*        
        //Approach1 -- TC:O(N) SC:O(N)
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],1);
                if(hm.get(nums[i]) > nums.length/2){
                    return nums[i];
                }
            }
            else{
                hm.put(nums[i],hm.get(nums[i])+1);
                if(hm.get(nums[i]) > nums.length/2){
                    return nums[i];
                }
            }
        }
        return 0;
*/

        //Approach2 -- TC:O(N) SC:O(1)
        int count = 1;
        int elem = nums[0];
        for(int i=1;i<nums.length;i++){
            if(count == 0){
               elem = nums[i];
            }
            if(nums[i] == elem){
                count++;
            }
            else{
                count--;
            }
        }
        return elem;
    }
}