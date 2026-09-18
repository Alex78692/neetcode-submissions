class Solution {
    int max  =  Integer.MIN_VALUE;
    public int maxSubArray(int[] nums) {
                int   i = 0 ;
                int sum = 0;
                while(i<nums.length){
                    sum = Math.max(sum+nums[i],nums[i]);
                    max  = Math.max(max , sum);
                  i++;
                }
                return max;
    }
}
