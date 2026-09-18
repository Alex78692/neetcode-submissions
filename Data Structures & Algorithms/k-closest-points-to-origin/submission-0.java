class Solution {
    public int[][] kClosest(int[][] pt, int k) {

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(b[0], a[0])
        );

        for(int i = 0; i < pt.length; i++) {

            int x = pt[i][0];
            int y = pt[i][1];

            int dist = x * x + y * y;

            pq.add(new int[]{dist, x, y});

            if(pq.size() > k) {
                pq.poll();
            }
        }

        int[][] ans = new int[k][2];

        for(int i = 0; i < k; i++) {

            int[] data = pq.poll();

            ans[i][0] = data[1];
            ans[i][1] = data[2];
        }

        return ans;
    }
}
