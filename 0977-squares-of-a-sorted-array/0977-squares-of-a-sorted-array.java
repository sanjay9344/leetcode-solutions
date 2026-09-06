class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int []a = new int[n];
        for(int i = 0;i<n;i ++){
           a[i]=nums[i]*nums[i];
        }
        for(int i = 0;i< n -1;i++){
            for(int j = i+1;j <n;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                }
            }
        }
        return a;
    }
}