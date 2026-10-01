class Solution {
    public int minCostClimbingStairs(int[] cost) {
            //  return min(cost,  cost.length);
            int index = 0 ; 
            int indexprev = 0 ;
            // int min = 0 ; 
            for(int  i  = 2 ; i<=cost.length  ; i++){
                   int right  =  cost[i-1]+index;
                   int left  =  cost[i-2]+ indexprev;
                   
                   
                   
                  int  min  =    Math.min(right   , left);
                   indexprev = index;
                   index  =  min;

            }
            return index;
          
    }
    //  int   min(int arr[] ,  int  n  ){
    //               if(n==0 || n==1){
    //                 return 0;
    //               }
                  
    //               int left  =  arr[n-1]+min(arr, n-1);
    //               int right  = arr[n-2] +min(arr, n-2);
    //               return Math.min(left, right);
    //          }
}
