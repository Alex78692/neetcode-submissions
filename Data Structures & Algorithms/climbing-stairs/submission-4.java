class Solution {
    
    public int climbStairs(int n) {
      //  int dp[] = new int[n+1];
     
      // dp[0] =  1 ; 
      // now lets  do space optimization   
      int  index =  1;
      int indexprev = 0 ;
      //  
       
    
      for(int  i = 1 ; i<=n ; i++){
          int current  =  index+indexprev;
            indexprev = index ;
          index =  current ;
           
      }
    
      return index;
     
    }
   


}
