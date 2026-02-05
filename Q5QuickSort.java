public class Q5QuickSort {
    public static void quickSort(int arr[], int left, int right){
        if(left>=right) return;
        int piv = partition(arr, left, right);
        quickSort(arr, left, piv-1);
        quickSort(arr, piv+1, right);
    }
    public static int partition(int arr[],int left, int right){
        int piv = arr[right];
        int i = left - 1;
        for(int j=left ; j<right;j++){
            if(arr[j]<piv){
                i+=1;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,right);
        return i+1;
    }
    private static void swap(int arr[],int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {5,3,8,22,98,16,2};
        System.out.println("Before sort: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        quickSort(arr, 0, arr.length-1);
        System.out.println("\nAfter sort: ");
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
