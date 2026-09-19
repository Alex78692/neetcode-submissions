class Solution {
      int[]d;
    public int climbStairs(int n) {
                // int index2 = 0 ; 
                // int index1 =  1;
                // for(int  i = 2; i<=n ; i++){
                //        int current =  index2+index1;
                //        index2 = index1;
                //        index1= current;
                // }
                // return index1;
                d = new int[n+1];
                return solve(n);

    }
    int solve(int n){
          if(n<=1){
            return 1;
          }
          if(d[n]!=0){
            return d[n];
          }
          d[n]=solve(n-1) + solve(n-2);
          return d[n];
    }
    
}
