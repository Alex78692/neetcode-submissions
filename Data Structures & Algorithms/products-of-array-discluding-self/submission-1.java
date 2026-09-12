class Solution {
    public int[] productExceptSelf(int[] nums) {
        
         int arr[] = new int[nums.length];
         
         int l = nums.length;
         
         for(int i = 0 ; i<l ; i++){
            int mul = 1;
            for(int j = 0 ; j<l ; j++){
        
                if(i==j){
                    continue;
                }
                else{
                    mul = mul*nums[j];
                }
            }
            arr[i]=mul;
            

         }
        
       return arr;
    }
}  
