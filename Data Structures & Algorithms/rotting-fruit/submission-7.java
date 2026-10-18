
class Solution {
    int n, m;
    int arr[][];

    public int orangesRotting(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        int min = Integer.MAX_VALUE;

        arr = new int[n][m];
        Queue<List<Integer>> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    list.add(0);

                    arr[i][j] = 1;
                    q.add(list);

                }
            }
        }
        int time  = 0 ; 
        min = bfs(q, grid);
         for(int  i  = 0 ;   i<n  ;   i++){
             for(int  j   = 0  ;   j< m ;   j++){
                  if(arr[i][j]!=1 && grid[i][j]==1){
                       return -1;
                  }
             }
         }
        return min;
    }

    int bfs(Queue<List<Integer>> q, int[][] grid) {
          int min = 0;
        while (!q.isEmpty()) {
            List<Integer> temp = q.remove();
            int time  =  temp.get(2);
            min =  Math.max(min,  time);
            int row[] = {0, 0, -1, 1};
            int col[] = {-1, 1, 0, 0};

            for (int i = 0; i < 4; i++) {
                int nr = temp.get(0) + row[i];
                int nc = temp.get(1) + col[i];
                

                if (nc >= 0 && nc < m &&
                    nr >= 0 && nr < n &&
                    arr[nr][nc] == 0 &&
                    grid[nr][nc] == 1) {
                    

                    arr[nr][nc] = 1;
                    grid[nr][nc] = 2;
                    List<Integer>  list  =  new ArrayList<>();
                    list.add(nr);
                    list.add(nc);
                    list.add(time+1);
                    q.add(list);
                    
                }
            }
        
        
            
        }
        
        return min;
    }
}
