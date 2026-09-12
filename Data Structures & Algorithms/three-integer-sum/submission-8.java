class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        // int i = 0 ;
        List<List<Integer>> list  = new ArrayList<>();
        
          Arrays.sort(arr);

          for(int i = 0 ; i <arr.length-2 ; i++){
              if (i > 0 && arr[i] == arr[i - 1]) {
        continue;
    }
                int l = i+1;
                int r= arr.length-1;
                
                while(l<r){
                    
                    int s = arr[i]+arr[l]+arr[r];
                    if(s==0){
                    List<Integer> ls = new ArrayList();
                    ls.add(arr[i]);
                    ls.add(arr[l]);
                    ls.add(arr[r]);
                         list.add(ls);
                    l++;
                    r--;
                    while(l<r && arr[l]==arr[l-1]){
                        l++;
                    }
                    while(l<r && arr[r]==arr[r+1]){
                     r--;
                    }

                    }
                    else if(s<0)
                    {
                        l++;
                    }
                    else{
                        r--;
                    }
                }
           

          }
          return list;
    }
}
