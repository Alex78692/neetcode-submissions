class Solution {
    public int[] productExceptSelf(int[] nums) {
        int a[] =new int[nums.length];
        // int s=1;
        for(int i = 0 ;i <nums.length ; i++){
        int s=1;

          for(int j = 0 ; j<nums.length ; j++){
            if(i!=j){
                  s = s*nums[j];
                  
            }
            a[i]=s;
            
          }
        }
        return a;
    }
}  
