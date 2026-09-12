class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) return 0;

        int longest = 1;

        for(int i = 0; i < nums.length; i++) {

            int current = nums[i];
            int count = 1;

            boolean found = true;

            while(found) {
                found = false;

                for(int j = 0; j < nums.length; j++) {
                    if(nums[j] == current + 1) {
                        current++;
                        count++;
                        found = true;
                        break;
                    }
                }
            }

            longest = Math.max(longest, count);
        }

        return longest;
    }
}
