class Solution {
    public int findGCD(int[] nums) {
        int max =nums[0],
        min = nums[0];
    for(int num : nums){
        max = Math.max(max,num);
         min = Math.min(min,num);
    }
     while(max!=0){
        int temp = max;
        max = min % max;
        min =temp;
     }   
     return min;
    }
}