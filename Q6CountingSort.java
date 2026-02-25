public class Q6CountingSort {
    private static int[] countingSort(int arr[],int n){
        int frq[];
        int ans[] = new int[n];
        int k=0;
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        frq = new int[max+1];
        for(int i=0;i<n;i++){
            frq[arr[i]]++;
        }
        for(int i=0;i<max+1;i++){
            while(frq[i]>0){
                ans[k++]=i;
                frq[i]--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,6,7,7,4,6,2};
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("after sort");
        int ans[]=countingSort(arr, arr.length);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
