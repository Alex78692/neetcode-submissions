class Solution {
    public int maxProfit(int[] p) {
        int l = 0 ; 
        int r = 1;
        int max = 0 ;
        int n = p.length;
        while(r<n){
            if(p[l]<p[r]){
                int pro = p[r]-p[l];
                max = Math.max(max , pro);

            }else{
                l = r;
            }
            r++;
        }
        return max;
    }
}
