class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
       int s = 0,a = 0;
       int[]count = new int[grid.length* grid.length+1];
        for(int i =0; i<grid.length;i++){
            for(int j =0 ; j < grid[i].length;j++){
             count[grid[i][j]]++;
            }  
            }
        for(int i =1 ; i <= grid.length * grid.length; i++){
           if(count[i] == 2){
            a= i;
           }
           if(count[i] == 0){
            s =i;
           }
        }
        return new int[]{a,s};
    }
}