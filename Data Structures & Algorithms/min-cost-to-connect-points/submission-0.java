// class Solution {
//     public int minCostConnectPoints(int[][] points) {
        
//     }
// }

class Solution {
    public int  minCostConnectPoints(int[][] points) {
            
        

          PriorityQueue<int[]> pq  =  new  PriorityQueue<>
          ((a , b ) ->Integer.compare(a[0] ,  b[0]));

          
        
          int arr[] ={0 ,   0};
        
          int node  =0;
          int n  = points.length;
          int visited[] =   new int[n]; 
          pq.add(arr);
          int sum  = 0;
          while(!pq.isEmpty() && node<n){
                int temp[] =   pq.poll();
                  int weight  =   temp[0];
                   node  =  temp[1];
                  if(visited[node]!=1){
                      sum+= weight ; 
                      visited[node] = 1;
                  }
                  else{
                      continue;
                  }
                  
                  
                  
                  
                  for(int  i  = 0 ;   i<n ;   i++){
                             
                             int dis =   Math.abs(points[node][0]-points[i][0])+
                             Math.abs(points[node][1]-points[i][1]);
                             if(visited[i]==0){
                                
                                int temp2[] ={dis, i};
                                 pq.add(temp2);
                             }
                  }
                  
          }
          return sum  ; 
        
    }
}