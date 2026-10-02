class Solution {
     Boolean dp[][];
    public boolean canPartition(int[] nums) {
           int sum = 0 ;
                for(int  i :  nums){
                    sum+=i;
                }

                if(sum%2==0){
                  sum =  sum/2;
                }
                else{
                    return false;
                }
                dp  =  new Boolean[nums.length][sum+1];
                
       return LetSee(nums , sum,  nums.length-1);
    }
       boolean LetSee(int nums[] , int sum, int i){
              if(sum==0){
                  return  true;
              }
              if(i < 0|| sum<0){
                  return false;
              }
              if(dp[i][sum]!=null){
                return dp[i][sum];
              }
            boolean left =  LetSee(nums , sum-nums[i] ,i-1);
            boolean right =   LetSee(nums ,  sum , i-1);
            dp[i][sum]=  left||right ;
            return dp[i][sum];
       }
}
