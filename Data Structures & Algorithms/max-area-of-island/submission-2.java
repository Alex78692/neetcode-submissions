
class Solution {
    public int maxAreaOfIsland( int [][] grid) {
            
   int max=0;
             
            int arr[][] =  new int[grid.length][grid[0].length];
            for(int i   = 0 ;     i   <  grid.length ;  i++){
                  for(int j= 0 ;   j  < grid[0].length ; j++){
                       if(arr[i][j]!=1 && grid[i][j]==1){
                              arr[i][j]=1;
                            //   count++;
                              max =Math.max(max, 1+dfs(i ,   j   , grid  , arr));
                       }
                  }
            }
    
            
        



        return max;
            
    }
    int  dfs(int i  ,   int j  ,  int [] []grid , int[][] arr){
         
            int area=0;
            int  r []  =  {0 ,0 , -1, 1};
            int  c []  =  {-1, 1, 0 ,0};
            for(int k = 0 ; k<4;  k++){
                  int nr   = r[k]+i;
                  int nc   = c[k]+j;
                  if(nc>=0 && nr>=0  && nr<grid.length  && 
                  nc<grid[0].length && arr[nr][nc]!=1 && grid[nr][nc]==1){
                          arr[nr][nc]=1;
                    area  +=  grid[nr][nc]+dfs(nr, nc, grid, arr);
                  }
            }
             return area;
           } 
    }
