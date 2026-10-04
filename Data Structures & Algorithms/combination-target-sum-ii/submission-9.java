
class Solution {
     HashSet<List<Integer>>  set  ;
      List<List<Integer>> ans;
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
       ans  =  new ArrayList<>();
      List<Integer>  l =  new ArrayList<>();
       

      //    for(int  i = 0  ;  i<nums.length  ;  i++){
             set  =  new HashSet<>();
            Arrays.sort(nums);
            sum(nums  ,  target  ,  0 , l );
         
    
    return ans ; 
    } 
      void sum(int []nums ,  int target,  int i ,   List<Integer> list){
               if(target==0){
                //   if(!set.contains(list)){
                     ans.add(new ArrayList<>(list));
                //      set.add(new ArrayList<>(list));
                //   }
                  
                  return ;
               }

               if(target<0 ||  i> nums.length-1 ){
                      return;
               }
                
                 
                 for(int  index=  i ;  index <nums.length ; index++){
                    if(index>i && nums[index]==nums[index-1]){
                            continue ;
                    }
                 
                   list.add(nums[index]);
                   sum(nums ,  target-nums[index], index+1, list);
                    list.remove(list.size()-1);
                 }
                //   sum(nums ,  target ,  i+1, list);
            

      }
}