class Solution {
    public int rob(int[] nums) {
          if(nums.length==1){
            return nums[0];
          }
        int dp[]  =  new int[nums.length];
        int index  =  Math.max(nums[1],nums[0]);
        int indexprev =  nums[0];
        for(int  i =2  ; i<nums.length ; i++){
              
              
            int left  =  nums[i]+indexprev;
              
             int  right  =  index;
              int min  =  Math.max(right , left);
            indexprev=  index;
            index   = min;
        }
        return index;
    }
}
