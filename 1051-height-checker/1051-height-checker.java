class Solution {
    public int heightChecker(int[] heights) {
        int []exp = new int[heights.length];
        int count =0;
        for(int i =0;i<heights.length;i++){
            exp[i] = heights[i];
        }
       for(int i = 0;i < heights.length; i++){
        for(int j = i + 1; j < heights.length; j++){
            if(exp[i]>exp[j]){
                int t = exp[i];
                exp[i] = exp[j];
                exp[j] = t;
            }
        }
       }
         for( int i =0; i< heights.length;i++){
            if(exp[i] != heights[i]){
                count++;
            }
         }
         return count;
}
}