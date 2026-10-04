class Solution {
    public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> list =  new ArrayList<>();
            List<Integer> l =  new ArrayList<>();

      sub(nums , list , 0 , l);

      return list;

               
    }

     void     sub(int[] nums , List<List<Integer>> list ,int index , List<Integer>  l ){
                    if(index>nums.length-1){
                        list.add( new ArrayList<>(l));
                        return ;
                    }

                    l.add(nums[index]);
                    sub(nums, list,  index+1 ,  l);
                    l.remove(l.size()-1);
                    sub(nums, list ,  index+1 ,  l);


          }
}
