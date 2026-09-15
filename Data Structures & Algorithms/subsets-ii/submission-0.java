class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
              List<List<Integer>>  ans  =  new ArrayList<>();
              List<Integer>  c =  new ArrayList<>();


            com(nums ,  ans , c , 0);
            return ans ;
    }
    void com(int[] nums  , List<List<Integer>> ans , List<Integer> c,   int in){
        ans.add(new ArrayList(c));
        Arrays.sort(nums);
        for(int  i = in  ; i <nums.length ; i++){
                if(i>in && nums[i]==nums[i-1]){
                    continue;
                }
                c.add(nums[i]);
                com(nums , ans , c,  i+1);
                c.remove(c.size()-1);
        }
    }
}
