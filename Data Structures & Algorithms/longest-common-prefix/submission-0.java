class Solution {
    public String longestCommonPrefix(String[] strs) {
           Arrays.sort(strs);
           String s  ="";
           String str =   strs[0];
        //    HashSet<Character>   set  =  new HahSet<>();
           for(int i   = 0 ;  i<str.length() ;   i++){
                    char c = str.charAt(i);
                    boolean t = true ;
                 for(int  j  = 0 ;  j<strs.length ; j++){
                        String str2 = strs[j];
                       if(c!=str2.charAt(i)){
                          t =  false;  
                           
                       }
                 }
                 if(t){
                      s+=c;
                      
                 }
                 else{
                       break;
                      
                 }
           }
           return s;
    }
}