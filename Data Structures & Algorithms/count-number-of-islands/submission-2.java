class Solution {
    public int numIslands(char[][] grid) {
            
   int count=0;
             
            int arr[][] =  new int[grid.length][grid[0].length];
            for(int i   = 0 ;     i   <  grid.length ;  i++){
                  for(int j= 0 ;   j  < grid[0].length ; j++){
                       if(arr[i][j]!=1 && grid[i][j]=='1'){
                              arr[i][j]=1;
                              count++;
                              bfs(i ,   j   , grid  , arr);
                       }
                  }
            }
    
            
        



        return count;
            
    }
    void bfs(int i  ,   int j  ,  char[] []grid , int[][] arr){
           Queue<List<Integer>>  q = new LinkedList<>();
           List<Integer>  list   =  new ArrayList<>();
           list.add(i);
           list.add(j);
           q.add(list);
           while(!q.isEmpty()){

            List<Integer>  temp  =  q.remove();
            int row  =  temp.get(0);
            int  col  =  temp.get(1);
            int  r []  =  {0 ,0 , -1, 1};
            int  c []  =  {-1, 1, 0 ,0};
            for(int k = 0 ; k<4;  k++){
                  int nr   = r[k]+row;
                  int nc   = c[k]+col;
                  if(nc>=0 && nr>=0  && nr<grid.length  && 
                  nc<grid[0].length && arr[nr][nc]!=1 && grid[nr][nc]=='1'){
                          arr[nr][nc]=1;
                          List<Integer>  l =  new ArrayList<>();
                          l.add(nr);
                          l.add(nc);
                          q.add(l);
                  }
            }

           } 
    }
}
