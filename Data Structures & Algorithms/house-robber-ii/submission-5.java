class Solution {
    public int rob(int[] nums) {
              if(nums.length==1){
                return nums[0];
              }
              if(nums.length==2){
                return Math.max(nums[0] , nums[1]);
              }
             int indexprev1  =  nums[1];
             int index1 = Math.max(nums[2] , nums[1]); 
              for(int  i =3 ; i<nums.length ; i++){
                     int left  = nums[i] + indexprev1;
                     int right  =  index1;
                     int max  =  Math.max(left , right);
                     indexprev1 =  index1 ; 
                     index1 =  max;
              }
                int indexprev2 =  nums[0];
                int index2 =  Math.max(nums[0], nums[1]);
                for(int  i =2 ; i<nums.length-1 ; i++){
                     int left  = nums[i] + indexprev2;
                     int right  =  index2;
                     int max  =  Math.max(left , right);
                     indexprev2 =  index2 ; 
                     index2 =  max;
              }
              return Math.max(index1,index2);
    }

    
}
