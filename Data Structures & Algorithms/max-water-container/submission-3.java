class Solution {
    public int maxArea(int[] h) {
      int l  = 0 ; 
      int r = h.length-1;
      int max = 0;
      while(l<r){
        int hi = Math.min(h[l],h[r]);
        int b = r-l;
        int ar = b*hi;
        max = Math.max(max,ar);
        if(h[l]<h[r]){
          l++;
        }
        else{
          r--;
        }

        
      }
      return max;
        
    }
}
