class Solution {
    public int islandPerimeter(int[][] grid) {
        int n  =  grid.length  ; 
        int m  =  grid[0].length;
        Queue<List<Integer>>  q =  new LinkedList<>();
             int arr[][] =  new int[n][m];
             for(int  i   =  0 ;   i<   n   ; i++){
                  for(int  j  = 0 ; j<   m  ;  j++){
                     if(grid[i][j]==1 && arr[i][j]==0){
                        arr[i][j]=1;
                 List<Integer>   l  =  new ArrayList<>();
                 l.add(i);
                 l.add(j);
                 q.add(l);
                 break;
                     }
                  }
             }
             int count  = 0;  
           while(!q.isEmpty()){
               List<Integer>   l  =  q.remove();
               
               int r[]  =  { 0 ,  0, -1, 1};
               int c[] =  {-1,1 , 0, 0};
               for(int   k   =   0  ;k< 4 ;  k++){
                   
                   int nr  =  r[k]+l.get(0);
                   int nc  =  c[k]+l.get(1);


                    if (nr < 0 || nr >= n || nc < 0 || nc >= m) {
                    count++;
                }
                // Water cell: perimeter +1
                else if (grid[nr][nc] == 0) {
                    count++;
                }
                   else if(nc>=0 && nc< m  && nr>=0  && nr<n &&
                      arr[nr][nc]==0 && grid[nr][nc]==1
                   ){
                       arr[nr][nc]=1;
                      List<Integer>  ll   =  new ArrayList<>();
                      ll.add(nr);
                      ll.add(nc);
                      q.add(ll);
                      
                   }

               }

           }
        return count;
    }
}