class Solution {
    public char findTheDifference(String s, String t) {
       int result =0;
       for(char c : s.toCharArray()){
         result = result ^ c;
       }
        for(char c : t.toCharArray()){
         result = result ^ c;
       }
       return (char) result;
 }
}