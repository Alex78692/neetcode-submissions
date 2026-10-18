class Solution {
    int arr[][] ; 
    public int numIslands(char[][] grid) {
          int n =  grid.length ;
          int  m  =   grid[0].length;
          arr =  new int[grid.length][grid[0].length];
          int count   = 0 ; 
          for(int  i  = 0 ;   i<n ;   i++){
             for(int  j    = 0 ;   j< m  ;   j++){
                   if(arr[i][j]==0 && grid[i][j]=='1'){
                    arr[i][j]=1;
                    Queue<List<Integer>>  q =  new LinkedList<>();
                    List<Integer>   l =  new ArrayList<>();
                    l.add(i);
                    l.add(j);
                    q.add(l);
                     count++;
                    bfs(grid,  q);
                   
                   }
             }
          }
          return count ;
          
    }
    void bfs(char grid[][] , Queue<List<Integer>>  q){
              while(!q.isEmpty()){
               List<Integer>   temp   =  q.remove();
               int i  =   temp.get(0);
               int j   =  temp.get(1);
               int row[] =  {0 , 0  , -1, 1};
               int col[] =  { 1, -1 ,   0 ,  0};
               for(int  n =0 ;   n < 4 ;   n++){
                   int nr  = i+row[n];
                   int nc =  j+col[n];
                   if(nc>=0 && nc<grid[0].length && nr>=0 && nr<grid.length && arr[nr][nc]!=1 && grid[nr][nc]=='1'){
                       arr[nr][nc]=1;
                       List<Integer> list  =new   ArrayList<>();
                       list.add(nr);
                       list.add(nc);
                       q.add(list);
                   }
               }

              }
    }
}
