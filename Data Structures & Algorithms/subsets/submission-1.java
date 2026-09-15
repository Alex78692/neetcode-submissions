class Solution {
    public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>>  ans  =  new ArrayList<>();
            List<Integer>  cur  =  new ArrayList<>();
            back(ans  , cur ,  0 ,  nums);
            return ans ;



    }

    void back(List<List<Integer>> ans   ,List<Integer> cur,  int  in ,  int[]  nums){
              ans.add(new ArrayList(cur));
              for(int i  =  in ; i<nums.length ; i++){
                       cur.add(nums[i]);
                       back(ans , cur, i+1 , nums);
                       cur.remove(cur.size()-1);
              }
    }
}
