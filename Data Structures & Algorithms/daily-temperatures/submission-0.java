class Solution {
    public int[] dailyTemperatures(int[] temp) {
           Stack<Integer> stack = new Stack<>();
           int arr[]=  new int[temp.length];
           for(int i = 0 ; i <temp.length ; i++){
            // int r = 0;
                while(!stack.empty() && temp[i]>temp[stack.peek()]){
                    int  r =stack.pop();
                      arr[r]=i-r;
                }//while
               
                stack.push(i);
           }//for
           return arr;
    }
}
