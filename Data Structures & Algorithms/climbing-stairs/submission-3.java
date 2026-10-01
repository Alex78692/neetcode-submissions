class Solution {
    
    public int climbStairs(int n) {
       int dp[] = new int[n+1];
     
      dp[0] =  1 ; 
    
      for(int  i = 1 ; i<=n ; i++){
           int right  = 0 ;
           
           if(i-2 >=0){
                right =  dp[i-2];
           }
            int left  =  dp[i-1];
           
            dp[i] = left + right ;
      }
    
      return dp[n];
     
    }
   


}
