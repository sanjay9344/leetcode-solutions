class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[] = new int[nums.length];
       for(int i =0; i < nums.length; i++){
        arr[i] = 1;
       }
        int l =1 , r =1;
    for(int i =0; i < nums.length; i++){
     arr[i] = arr[i] * l;
     l = l * nums[i];
    }
      for(int i = nums.length -1; i >= 0; i --){
     arr[i] = arr[i] * r;
     r = r * nums[i];
    }
        return arr;    
    }
}