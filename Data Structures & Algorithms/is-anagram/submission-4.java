class Solution {
    public boolean isAnagram(String s, String t) {
        int  ar[] = new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        for(int  i = 0 ; i < s.length() ; i++){
            ar[s.charAt(i)-'a']++;
            ar[t.charAt(i)-'a']--;

        }
        for(int n : ar){
            if(n!=0){
                return false;
            }
            // return true;
        }
        return true;
    }
}
