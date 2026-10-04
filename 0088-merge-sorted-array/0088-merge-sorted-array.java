class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int []a = new int[m+n];
        int  k =0;
        for(int i =0; i < m;i++){
            a[k] = nums1[i];
            k++;
        }
         for(int i =0; i < n;i++){
            a[k] = nums2[i];
            k++;
        }
        for(int i = 0 ; i < m + n - 1;i++){
            for(int j = i + 1; j < m + n ; j++){
                if(a[i] > a[j]){
                      int t = a[i];
                      a[i] = a[j];
                      a[j] = t;
                }
            }
        }
        for(int i = 0 ; i < m+n;i++){
            nums1[i] = a[i];
        }
    }
}