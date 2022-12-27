class Solution {
    public int subarraySum(int[] nums, int k) {

/*       
        //Approach1 -- TC:O(N^2) SC:O(N)
        int sum[] = new int[nums.length+1];
        sum[0] = 0;
        for(int i=1;i<sum.length;i++){
            sum[i] = sum[i-1]+nums[i-1];
        }

        int count = 0;
        for(int i=0;i<sum.length;i++){
            for(int j=i+1;j<sum.length;j++){
                if(sum[j]-sum[i] == k){
                    count++;
                }
            }
        }
        return count;
*/
        //Approach2 -- TC:O(N) SC:O(N)
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum = 0;
        hm.put(0,1);
        int count = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(hm.containsKey(sum-k)){
                count+=hm.get(sum-k);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;

    }
}