class Solution {
    public int rob(int[] nums) {
          if(nums.length==1){
            return nums[0];
          }
        int dp[]  =  new int[nums.length];
        dp[0] =  nums[0];
        dp[1] = Math.max(nums[1],nums[0]);
        for(int  i =2  ; i<nums.length ; i++){
              
              
            int left  =  nums[i]+dp[i-2];
              
             int  right  =  dp[i-1];
              int min  =  Math.max(right , left);
              dp[i]=  min;
        }
        return dp[nums.length-1];
    }
}
