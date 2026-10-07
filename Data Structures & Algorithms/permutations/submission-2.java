class Solution {
       List<List<Integer>>  ans ;
    public List<List<Integer>> permute(int[] nums) {
          ans  =  new ArrayList<>();
            int arr[] =  new int[nums.length];
           List<Integer>  list =  new ArrayList<>();
            fun(arr, nums, list );
            return ans;
    }
     
   void   fun(int  arr[] ,  int nums[] ,  List<Integer>  list  ){
         if(list.size()==nums.length){
            ans.add(new ArrayList(list));
            return ;
         }

            for(int  i = 0 ;  i < nums.length  ;  i++){
                      if(arr[i]!=1){
                          arr[i]=1;
                         list.add(nums[i]);
                         fun(arr, nums , list);
                          list.remove(list.size()-1);
                          arr[i]=0;
                      }
                     
            }

     }

}
