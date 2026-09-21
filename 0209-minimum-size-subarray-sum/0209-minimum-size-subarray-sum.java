class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // 2 3 1 2 4 3
        //           r
        //           l
        // sum = 3
        // minlen = 2
        int sum =0 , left =0 ,right =0;
        int minlen = Integer.MAX_VALUE;
        while( right < nums.length){
            sum = sum + nums[right];
            while( sum >=target){
                minlen = Math.min(minlen,right - left  + 1);
                sum = sum - nums[left];
                left++;
            }
            right++;
        }
        return minlen == Integer.MAX_VALUE ? 0 : minlen;
        }
    }