class Solution {
    public int maxArea(int[] h) {
           int ans  = 0 ;
           int l = 0 ; 
           int r = h.length-1;
           while(l<r){
               int w = r- l;
               int hi = Math.min(h[l], h[r]);
               int area = w*hi;
               ans  = Math.max(ans ,area);
               if(h[l]<h[r]){
                l++;
               }
               else{
                r--;
               }
           } 
           
return ans ;
    }
}
