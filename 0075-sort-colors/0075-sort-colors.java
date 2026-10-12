class Solution {
    public void sortColors(int[] nums) {
      int wz = 0,
      curr =0,
      wt =nums.length -1;
      while(curr <= wt){
        if(nums[curr] == 0){
            int temp = nums[wz];
            nums[wz] = nums[curr];
            nums[curr] = temp;
           wz++;
           curr++;
        } 
        else if( nums[curr] == 1){
            curr++;
        }     
        else{
            int temp = nums[wt];
            nums[wt] = nums[curr];
            nums[curr] = temp;
            wt --;
        }
    } 
    }
}