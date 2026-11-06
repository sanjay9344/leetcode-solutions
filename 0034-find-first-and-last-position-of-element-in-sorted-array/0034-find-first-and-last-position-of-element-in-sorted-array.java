class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0 , h = nums.length -1 ;
        int si = -1 , ei =-1 ; 
        while(l <= h){
            int mid = l + (h - l)/2;
            if(nums[mid] > target) h = mid -1;
            else if(nums[mid] < target) l = mid +1;
            else {
              si = mid;
              h = mid -1;
            } 
        }
        l = 0 ; h = nums.length -1;
        while(l <= h){
             int mid = l +  (h - l)/2;
            if(nums[mid] > target) h = mid -1;
            else if(nums[mid] < target) l = mid +1;
            else {
               ei = mid;
               l = mid +1;
            } 
        }
      
             return new int[]{si,ei};
    }
}