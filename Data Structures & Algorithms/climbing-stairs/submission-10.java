class Solution {
    // int dp
    public int climbStairs(int n) {
         
            int next =  1;
            int prev  =  0  ;
            for(int  i  = 1 ;   i<=n ;  i++){
                   int curr  =   next+prev;
                   prev =  next;
                   next  =  curr;
            }
            return next;
    }
}
