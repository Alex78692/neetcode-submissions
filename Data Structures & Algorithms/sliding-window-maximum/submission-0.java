// import java.util.*;

class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int[] result = new int[n - k + 1];

        Deque<Integer> dq = new ArrayDeque<>();

        int index = 0;

        for(int i = 0; i < n; i++){

            // 1️⃣ Remove elements outside window
            if(!dq.isEmpty() && dq.peekFirst() == i - k){
                dq.pollFirst();
            }

            // 2️⃣ Remove smaller elements from back
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }

            // 3️⃣ Add current index
            dq.offerLast(i);

            // 4️⃣ Start storing result after first window
            if(i >= k - 1){
                result[index++] = nums[dq.peekFirst()];
            }
        }

        return result;
    }
}