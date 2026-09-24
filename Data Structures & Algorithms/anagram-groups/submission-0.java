class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
                // HashMap<Integer , String>   map = new HashMap<>();
                HashMap<String , List<String>>  map =  new HashMap<>();
                
                List<List<String>> ans =  new ArrayList<>();

          for(int  i = 0 ;  i<strs.length ; i++){
                 String  s=  strs[i];
                 char [] arr =  s.toCharArray();
                Arrays.sort(arr);
                 String  s2  =  new String(arr);
                if(!map.containsKey(s2)){
                       map.put(s2, new ArrayList<>());
                }
                map.get(s2).add(s);
                
          }
          for(List<String>  ss : map.values())
           {
            ans.add(ss);
           }
           return ans;

    }
}
