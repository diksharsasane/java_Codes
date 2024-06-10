public class MaxProduct {
    public static int mxpro(int arr[] , int n){
        int maxprodt= arr[0];
        for(int i=0;i<n;i++){
            int maxval=arr[i];
            for(int j=i+1;j<n;j++){
                maxprodt=Math.max(maxval,maxprodt);
                maxval=maxval*arr[j];
            }
            maxprodt=Math.max(maxval,maxprodt);
        }
        return maxprodt;
    }
    public static void main(String[] args) {
        int[] arr = { 1, -2, -3, 0, 7, -8, -2 };
        int n = arr.length;
        System.out.println(mxpro(arr,n));
    }
}
