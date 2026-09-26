class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
       for(int i = 0 ; i < s.length();i++){
        char num = s.charAt(i);
       map.put(num , map.getOrDefault(num,0)+1);
       } 
       for(int i = 0; i < s.length();i++) {
        char num = s.charAt(i);
        if(map.get(num) == 1){
            return i;
        }
       }
       return -1;
    }
}