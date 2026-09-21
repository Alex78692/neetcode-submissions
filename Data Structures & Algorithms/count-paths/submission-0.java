class Solution {
    //   int  l = 0 ;
    //   int u = 0 ;
      int dp[][];


           
    public int uniquePaths(int m, int n){
           dp =  new int[m+1][n+1];
           return Paths(m , n );
    }
    public int Paths(int m, int n) {
           if(m==1 || n==1){
               return 1;
           }
           if(dp[m][n]!=0){
            return dp[m][n];
           }
        //    if(m<0 || n<0){
        //      return 0;
        //    }
           
           int  l = Paths(m,n-1);
           int  u  = Paths(m-1 , n);
           dp[m][n]=l+u;
           return dp[m][n];
          
    }
}
