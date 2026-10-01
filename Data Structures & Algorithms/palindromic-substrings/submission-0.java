
class Solution {
     int count;
    public int  countSubstrings(String s) {
            count = 0 ;
                   for(int i = 0  ; i<s.length() ; i++){
                          
                          pal(s, i  , i+1);
                         pal(s ,   i , i);
                          
                   } 

                  
                    //  return s.substring(start, max+start) ;
                    return count;
    }

    void pal(String s , int ml,  int mr){
              
                if(mr<0 || ml>s.length()-1){
                    return ;
                }
                    while(ml>= 0   && mr < s.length() 
                     && s.charAt(mr)==s.charAt(ml))
                       
                        {
                            count=count+1;
                          mr++;
                          ml--;
                       }
                       

                // int len  =  mr-ml-1;
                //  if(len>max){
                // max  =  len  ; 
                // start = ml+1;
                //  }
                

    }
}