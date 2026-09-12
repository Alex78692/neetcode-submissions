class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i = 0 ; i < nums.length-1; i++){
            // int j = i+1;
            for(int j = i+1 ; j<nums.length ; j++){
                if(nums[i]==nums[j]){
                    // break;
                    return true ; 
                    
                }
            }
        }
        return false;
    }
}