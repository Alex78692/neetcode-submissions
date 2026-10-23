class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;

        int[][] dist = new int[n][m];

        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );

        dist[0][0] = 0;
        pq.offer(new int[]{0, 0, 0}); // effort, row, col

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();

            int effort = curr[0];
            int row = curr[1];
            int col = curr[2];

            if (row == n - 1 && col == m - 1) {
                return effort;
            }

            if (effort > dist[row][col]) {
                continue;
            }

            for (int i = 0; i < 4; i++) {
                int nr = row + dr[i];
                int nc = col + dc[i];

                if (nr < 0 || nr >= n ||
                    nc < 0 || nc >= m) {
                    continue;
                }

                int edgeEffort = Math.abs(
                    heights[row][col] - heights[nr][nc]
                );

                int newEffort = Math.max(effort, edgeEffort);

                if (newEffort < dist[nr][nc]) {
                    dist[nr][nc] = newEffort;
                    pq.offer(new int[]{newEffort, nr, nc});
                }
            }
        }

        return 0;
    }
}