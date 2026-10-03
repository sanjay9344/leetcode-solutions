class Solution {
    public int differenceOfSum(int[] nums) {
      int s =0, sum =0;
      for(int i =0; i< nums.length;i++){
        s = s+nums[i];
        int n = nums[i];
        while(n > 0){
            sum = sum +n %10;
            n = n/10;
        }
      }
      return Math.abs(s - sum); 
    }
}