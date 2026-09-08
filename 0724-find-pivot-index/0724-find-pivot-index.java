class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int sum =0;
        for(int i = 0;i < n; i++){
            sum = sum + nums[i];
        }
        int ls = 0;
        for(int j = 0;j < n;j++){
            int rs = sum - ls - nums[j];
            if(ls == rs){
                return j;
            }
            else{
                ls = ls + nums[j];
            }
        }
        return -1;
    }
}