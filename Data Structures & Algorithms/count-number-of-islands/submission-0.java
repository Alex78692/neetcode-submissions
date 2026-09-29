
class Solution {
    public int numIslands(char[][] grid) {
        int arr[][]   = new int[grid.length][grid[0].length];
        int count = 0 ;
        
        for(int i  = 0 ; i <grid.length ; i++){
               for(int  j = 0  ; j<grid[i].length ; j++){
                      if(grid[i][j]=='1' && arr[i][j]!=1){
                                                    count=count+1;
                          bfs(grid,  i ,  j ,arr);

                          
                      }
                     
               }
               
               
        }
        return count;
        
    }
    
    void bfs(char[][] grid , int  i  , int  j  ,int [][]arr){
            int row[] = {0, 0, 1, -1, 1, 1, -1, -1};
            int col[] = {-1, 1, 0, 0, 1, -1, 1, -1};
            
            Queue<ArrayList<Integer>>  q =  new LinkedList<>();
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(i);
            temp.add(j);
            arr[i][j]=1;
            q.add(temp);
            while(!q.isEmpty()){
                  ArrayList<Integer> t  =  q.remove();
                  int r =  t.get(0);
                  int c = t.get(1);
                
                for(int n = 0 ; n<4 ; n++){
                      int newRow = r+row[n];
                      int newCol = c+col[n];
                      
                      if(newRow>=0 && newRow<grid.length &&
                      newCol>=0 && newCol<grid[0].length){
                        if(arr[newRow][newCol]!=1 && grid[newRow][newCol]=='1'){
                            arr[newRow][newCol]=1;
                             ArrayList<Integer> l = new ArrayList<>();
                             l.add(newRow);
                             l.add(newCol);
                             q.add(l);
                        }
                      }
                      }
                
            }
    }
    

}