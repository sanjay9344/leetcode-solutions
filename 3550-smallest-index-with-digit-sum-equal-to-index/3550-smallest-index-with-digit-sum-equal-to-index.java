class Solution {
    public int smallestIndex(int[] nums) {
     int  minind= Integer.MAX_VALUE;
     for(int i =0; i < nums.length;i++){
        int sum =0;
        int n = nums[i];
        while(n > 0){
            sum = sum + n % 10;
            n = n/10;
        }
        if(sum == i){
            minind = Math.min(minind,i);
        }
     }
     return minind == Integer.MAX_VALUE ? -1 : minind;
    }
}