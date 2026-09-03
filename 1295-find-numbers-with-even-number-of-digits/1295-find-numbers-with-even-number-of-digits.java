class Solution {
    public int findNumbers(int[] nums) {
        int n =nums.length;
        String[] str = new String[n];
        int count = 0;
        for(int i = 0; i< n; i++){
            str[i] = String.valueOf(nums[i]);
            if(str[i].length() % 2 == 0){
                count++;
            }
        }
    return count;
    }
}