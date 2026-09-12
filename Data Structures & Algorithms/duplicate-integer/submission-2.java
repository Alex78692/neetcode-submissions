class Solution {
    public boolean hasDuplicate(int[] nums) {
      Arrays.sort(nums);
    int  i = 0 ; 
//   int j = 1;
  for(int j = 1 ; j<nums.length ; j++ ){
    if(nums[i]!=nums[j]){
        i = j;
        // j++;
    }
    else {
        return true;
    }
    
  }
  return false;
      
    }
}