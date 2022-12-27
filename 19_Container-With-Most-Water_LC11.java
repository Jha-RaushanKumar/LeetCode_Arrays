class Solution {
    public int maxArea(int[] height) {

        //Approach1 -- TC:O(N) SC:O(1)
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = height.length-1;
        while(i<j){
            int w = j-i;
            int h = Math.min(height[i],height[j]);
            int area = w * h;
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
            max = Math.max(max,area);
        }
        return max;
        
    }
}