class Solution {
    int[] d;
    public int rob(int[] nums) {
            d= new int[nums.length];
            return sol(nums,nums.length-1);
    }
    int sol(int[] nums, int n){
            
           if(n==0){
            return nums[n];
           }
           if(n<0){
            return 0;
           }
           if(d[n]!=0){
            return d[n];
           }

    
           int rob = nums[n] +sol(nums,n-2);
           int skip  = sol(nums , n-1);
           
            // d[n]=Math.max(sol(nums ,n)+sol(nums ,n-2), sol(nums,n));
           
           d[n] =  Math.max(rob , skip);
           return d[n];
    }
}
