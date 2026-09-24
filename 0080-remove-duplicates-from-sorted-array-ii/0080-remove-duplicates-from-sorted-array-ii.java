class Solution {
    public int removeDuplicates(int[] nums) {
       int count = 0;
       int i = 0 , j =0;
       while(i<nums.length){
        if( i == 0 || nums[i] != nums[i-1]){
           count = 1;
           nums[j] = nums[i];
           j++;    
        }
        else{
            count++;
            if(count <= 2){
                nums[j] = nums[i];
                j++;
            }
        }
         i++;
       }
       return j; 
    }
}