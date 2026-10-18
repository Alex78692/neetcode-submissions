

class Solution {
    int mm = Integer.MAX_VALUE ;

    public void islandsAndTreasure(int[][] grid) {
        Queue<List<Integer>> q = new LinkedList<>();

        int n = grid.length;
        int m = grid[0].length;

        int arr[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0) {
                    arr[i][j] = 1;

                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    list.add(0);

                    q.add(list);
                }
            }
        }

        while (!q.isEmpty()) {
            

            List<Integer> temp = q.remove();

            int getRw = temp.get(0);
            int getCl = temp.get(1);
            int dist = temp.get(2);

            grid[getRw][getCl] = dist;

            int row[] = {0, 0, -1, 1};
            int col[] = {-1, 1, 0, 0};

            for (int k = 0; k < 4; k++) {
                int nc = getCl + col[k];
                int nr = getRw + row[k];

                if (nc >= 0 && nc < m &&
                    nr >= 0 && nr < n &&
                    arr[nr][nc] == 0 &&
                    grid[nr][nc] == mm) {

                    arr[nr][nc] = 1;

                    List<Integer> list = new ArrayList<>();
                    list.add(nr);
                    list.add(nc);
                    list.add(dist + 1);

                    q.add(list);
                }
            }
        }
    }
}

