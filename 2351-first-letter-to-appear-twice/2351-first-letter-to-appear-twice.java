class Solution {
    public char repeatedCharacter(String s) {
       int i = 0 , j = 1;
       while( i < s.length() && j < s.length()){
        if(s.charAt(i) == s.charAt(j)){
            return s.charAt(i);
        }
        else{
            i++; 
            if(i ==j){
                j++;
                i =0;
        }
       }
    }
      return ' ' ;
    }
}