class Solution {
    int max;
    int start ;
    public String longestPalindrome(String s) {
                  max  =  0;
                   start = 0 ;
        
                   for(int i = 0  ; i<s.length() ; i++){
                          
                          pal(s, i  , i+1);
                         pal(s ,   i , i);
                          
                   } 

                  
                     return s.substring(start, max+start) ;
    }

    void pal(String s , int ml,  int mr){
              
                if(mr<0 || ml>s.length()-1){
                    return ;
                }
                    while(ml>= 0   && mr < s.length() 
                     && s.charAt(mr)==s.charAt(ml))
                       
                        {
                          mr++;
                          ml--;
                       }
                int len  =  mr-ml-1;
                 if(len>max){
     max  =  len  ; 
     start = ml+1;
                 }
                

    }
}
