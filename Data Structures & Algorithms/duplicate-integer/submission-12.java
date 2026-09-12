class Solution {
    public boolean hasDuplicate(int[] nums) {
        // int  slow  = 0; 
        //  int fast  = 1;
         HashSet<Integer>  has = new HashSet<>();
         for(int n : nums){
            if(!has.isEmpty() &&  has.contains(n)){
                      return true;
            }
            else{
                has.add(n);
            }
         }
         return false;
    }
}