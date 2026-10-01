class Solution {
    int dp[];
    int dp2[];
    public int rob(int[] nums) {
              if(nums.length==1){
                return nums[0];
              }
             dp =  new int[nums.length];
             dp2 =  new int[nums.length];
             for(int  i = 0 ; i<nums.length ; i++){
                   dp[i]=-1;
                   dp2[i]=-1;
             }
             int l  =  rob2(nums, 1, nums.length-1, dp);
             int r  =  rob2(nums , 0, nums.length-2, dp2); 
             return Math.max(l,r);
    }

    int rob2(int []  arr,int i ,int  j ,int []dp){
              if(j==i){
                return arr[i];
              }
              if(j<i){
                return 0;
              }
              if(dp[j]!=-1){
                return dp[j];
              }

              int c1  =  arr[j]+rob2(arr,i,  j-2,dp);
              int c2  =  rob2(arr,i,  j-1,dp);
              int max  =  Math.max(c1, c2);
              dp[j] =  max ; 
              return dp[j];
    }
}
