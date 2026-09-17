class Solution {
    public String reverseWords(String s) {
        String trimmedString = s.trim();
        String[] arrStr = trimmedString.split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for(int i = arrStr.length - 1 ; i >=0; i--){
          sb.append(arrStr[i]);
          if(i != 0){
            sb.append(" ");
          }
        }
        return sb.toString();
    }
}
