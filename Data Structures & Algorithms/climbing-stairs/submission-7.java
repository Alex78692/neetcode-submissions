class Solution {


      int dp[] ;  
   public int climbStairs(int n) {
            dp= new int[n+1];
   return   climbStairs2(n) ;
   }
    
     int climbStairs2(int n) {
        if(n==0){
            return 1;

        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int l =climbStairs2(n-1);
          int r=     climbStairs2(n-2);
          dp[n] =  l+r;
        return dp[n];
// now lets  do space optimization   // space complexity is now constant and time complexity is O(N)
      // int  index =  1;
      // int indexprev = 0 ;
      // for(int  i = 1 ; i<=n ; i++){
      //   int current  =  index+indexprev;
      //   indexprev = index ;
      //   index =  current ;    
      // }return index;
     
    }
   


}
