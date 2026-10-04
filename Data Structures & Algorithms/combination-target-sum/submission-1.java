class Solution {
      List<List<Integer>> ans;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
       ans  =  new ArrayList<>();
      List<Integer>  l =  new ArrayList<>();

//     for(int i = 0  ;  i< nums.length ; i++){
            sum(nums  ,  target  ,  0 , l);
//     }
    
    return ans ; 
    } 
      void sum(int []nums ,  int target,  int index ,   List<Integer> list){
               if(target==0){
                  ans.add(new ArrayList<>(list));
                  return ;
               }
               if(target<0 ||  index> nums.length-1){
                      return;
               }


               for(int  i = index  ;  i<nums.length ; i++){
                   list.add(nums[i]);
                   sum(nums ,  target-nums[i], i, list);
                    list.remove(list.size()-1);
               }

      }
}
