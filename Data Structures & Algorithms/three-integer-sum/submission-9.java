class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
            List<List<Integer>> list  = new ArrayList<>();
            for(int  i = 0 ; i < arr.length-2 ; i++){
                if(i > 0  && arr[i]==arr[i-1]){
                    continue ; 
                }
                int  l  = i+1; 
                int  j = arr.length-1;
                
                while(l<j){
                    if(arr[i]+arr[l]+arr[j]==0){
                        List<Integer> ls = new ArrayList<>();
                        ls.add(arr[i]);
                        ls.add(arr[l]);
                        ls.add(arr[j]);
                        list.add(ls);

                        while(l<j && arr[l]==arr[l+1]){
l++;
                        }
                        while(l<j && arr[j]==arr[j-1]){
                            j--;
                        }
                        
                        
                       l++;
                       j--;

                    }
                    else if(arr[i]+arr[l]+arr[j]>0){
                        j--;
                    }
                    else{
                        l++;
                    }
                }

            }
            return list ;
    }
}
