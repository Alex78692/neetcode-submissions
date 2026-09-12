class Solution {
    public int maxArea(int[] arr) {
          int i = 0 ; 
          int j = arr.length-1;
          int max = 0; 
          while(i<j){
               int h = Math.min(arr[i],arr[j]);
               int area = h* (j-i);
               max = Math.max(max,area);
               if(arr[i]>=arr[j]){
                 j--;
               }
               else  {
                i++;
               }
               

          }
          return max;

    }
}
