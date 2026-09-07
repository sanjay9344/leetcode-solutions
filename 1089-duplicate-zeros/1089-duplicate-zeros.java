class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int []a = new int[n];
        int i = 0 , j =0;
        while(i<n){
            if(arr[i] == 0){
                if(j < n){
                a[j] = 0;
                }
                j ++;
                if(j < n){
                a[j] = 0;
                }
            }
            else{
                if(j < n){
                    a[j] = arr[i];
                }
            }
            i++;
            j++;
        }
        for( i = 0 ; i < n ; i ++){
            arr[i] = a[i];
        }
    }
}