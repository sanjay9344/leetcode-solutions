class Solution {
    public void rotate(int[] nums, int k) {
       int temp[] = new int[nums.length];
       for(int i =0; i < nums.length; i ++){
        temp[i] = nums[i];
       }
       for(int i = 0 ; i < nums.length; i++){
        int  p = i + k;
        if(p > nums.length - 1){
            p = ( i + k) % nums.length;
        }
       temp[p] = nums[i];
       }
    for(int i = 0; i < nums.length;i++){
        nums[i] = temp[i];
    }
    }
}