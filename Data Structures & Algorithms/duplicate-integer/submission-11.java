
// Error
// Memory: 0 MB
// •
// Time: 0ms
// •
// Submitted at: 08/23/2026 17:57
// •

// Suggest Fix
// Error

// Authentication required

// Code  |  Java


class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> map =new HashSet<>();
        for(int n : nums){
           if(!map.add(n)){
            return true;
           }
           

        } 
        return false;
    }
}