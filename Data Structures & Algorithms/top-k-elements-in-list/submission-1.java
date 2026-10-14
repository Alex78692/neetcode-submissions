class Solution {
    public int[] topKFrequent(int[] nums, int k) {
            HashMap<Integer , Integer>  map  =  new HashMap<>();
              PriorityQueue<List<Integer>> pq  =  new PriorityQueue<>((a , b)->Integer.compare(b.get(1) ,a.get(1)));
            for(int  i = 0 ;   i<  nums.length  ; i++){   map.put(nums[i],  map.getOrDefault(nums[i] ,  0)+1);
            }
        
            for(int  n :   map.keySet()){
                 List<Integer>  list =  new ArrayList<>();   
                 list.add(n);
                 list.add(map.get(n));
                 pq.add(list);
            }
             
    
    int arr[] =  new int[k];
  
    int j = 0 ;
  while(k>0){
     List<Integer> val  = pq.poll();
     int v =  val.get(0);
     arr[j]=v;
     j++;
     k--;
  }
  return arr;
}
}
