class Solution {
    public List<List<Integer>> permute(int[] nums) {
              int arr[] = new  int[nums.length];
            //   int p[] =  new int[nums.length]
             List<Integer>  l   =  new ArrayList<>();
             List<List<Integer>>  ans   =  new ArrayList<>();
            //   for(int  i  = 0  ;  i<nums.length  ;  i++){
                  
                  per(nums , arr,  ans  , l );
            //   }
              
              return ans  ; 

    }
    void per(int [] nums  , int[] arr, List<List<Integer>> ans ,  List<Integer> list ){
          if(list.size()==nums.length){
                ans.add(new ArrayList<>(list));
                return ;
          }
        //   if(index>nums.length-1){
        //       return ;
        //   }
          
          for(int  i =   0 ;  i < nums.length  ;  i++){
                if(arr[i]!=1){
                    list.add(nums[i]);
                    arr[i]=1;
                    per(nums,   arr, ans , list);
                    arr[i]=0;
                    list.remove(list.size()-1);
                }
          }
        
        
            
          
    }
}
