class Solution {
    public int minimumEffortPath(int[][] arr) {
        int n  =arr.length;
        int m  =arr[0].length;
        PriorityQueue<int[]>  pq  =  new  PriorityQueue<>(
           (a,  b)->Integer.compare(a[0] ,  b[0])
        );
        int dist[][] =  new int[n][m];

        for(int dis[] :  dist){
               Arrays.fill(dis ,  (int)1e9);
        }
        dist[0][0] =  0 ; 
        pq.add(new int[]{0 ,  0 ,   0});
        while(!pq.isEmpty()){
              int temp[] =  pq.poll();
              int effort =  temp[0];
              int r =  temp[1] ; 
              int c =  temp[2];
              if(r==n-1  && c==m-1){
                    return effort;
              }
              if(effort > dist[r][c]){
                   continue;
              }
              int row[] =  {0 , 0 ,  -1,  1};
              int col[] =  {-1, 1 ,  0,  0 };
              for(int i  = 0 ; i<4 ;   i++){
                    int nr  = row[i]+r;
                    int nc  =  col[i]+c; 
                    if(nr<0 ||  nr>n-1 || nc<0 ||  nc>m-1){
                            continue;
                    }
                     int edf  =  Math.abs(arr[r][c]-arr[nr][nc]);
                     int nf  =  Math.max(effort  ,   edf);
                    if(nf< dist[nr][nc]){
                           dist[nr][nc] =  nf;
                           pq.add(new int[]{nf, nr, nc});
                    }
              }
        }
   return  0 ;
    }
}