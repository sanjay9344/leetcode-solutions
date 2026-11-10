class Solution {
    public void rotate(int[] nums, int k) {
       int temp[] = new int[nums.length];
       k = k % nums.length;
       for(int i = 0 ; i < nums.length; i++){
        int p = (i +k)% nums.length;
       temp[p] = nums[i];
       }
    for(int i = 0; i < nums.length;i++){
        nums[i] = temp[i];
    }
    }
}