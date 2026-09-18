class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq  =  new PriorityQueue<>(
           (a, b)->Integer.compare(b[0] ,a[0])


        );
        for(int arr[] :  points){
               int x =  arr[0];
               int y = arr[1];
               int c =  x*x + y*y;
               pq.add(new int[]{c, x, y});
               if(pq.size()>k){
                pq.poll();
               }
        }
        int ans[][]  = new int[k][2];
        for(int  i = 0 ; i<k ; i++){
             int [] data =  pq.poll();
             ans[i][0] = data[1];
             ans[i][1]=data[2];
        }
        return ans;

    }
}
