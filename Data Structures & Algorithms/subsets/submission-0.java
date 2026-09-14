class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans =  new ArrayList<>();
           back(nums  , 0, new ArrayList<>() ,ans);
        return ans;
           
    }

    void back(int arr[] , int  in   , List<Integer> cur , 
    List<List<Integer>> ans){
        ans.add(new ArrayList(cur));
        for( int i =  in; i <arr.length ; i++){
                cur.add(arr[i]);
                back(arr, i+1 ,cur , ans);
                cur.remove(cur.size()-1);
        }
    }
}
