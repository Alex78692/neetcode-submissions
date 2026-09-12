class Solution {
    public int maxArea(int[] heights) {
        int max  = 0 ; 
        int  j= heights.length-1;
        // int j = 1;/
        int i = 0 ;
        while(i<j){
           
            int min= Math.min(heights[i],heights[j]);
            int h = min;
            int w = j-i;
             max = Math.max(max , h*w);
            if(heights[i]<heights[j]){
                i++;
            }
            else{
                j--;
            }
            
            
        
        }

        return max;
    }
}
