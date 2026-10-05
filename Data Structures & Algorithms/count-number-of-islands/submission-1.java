class Solution {
    public int numIslands(char[][] grid) {
          int count = 0 ;
          int [][] arr  =  new int[grid.length][grid[0].length];
        for(int  i = 0 ;  i< arr.length  ;  i++){
                for(int  j = 0 ;  j<grid[0].length ; j++){
                      if(arr[i][j]==0 && grid[i][j]=='1'){
                            // arr[i][j]=1;
                            count++;
                            dfs(arr, grid  ,  i , j);
                      }
                }
        }


        return count;
    }
    void dfs(int [][]arr, char [][]grid  , int row  ,  int col){
             arr[row][col]=1;
             int r []= {-1, 1, 0 ,  0};
             int c[] = {0 ,  0 ,  -1 ,1};
             for(int  i = 0 ; i<4 ;  i++){
                   int newRow  =  row+r[i];
                   int newCol =  col+c[i];
                   if(newRow>=0 && newRow<arr.length && newCol>=0 
                    && 
                   newCol<arr[0].length && arr[newRow][newCol]!=1
                   && grid[newRow][newCol]=='1'){
                       dfs(arr, grid, newRow, newCol);
                   }
             }
    }
}
