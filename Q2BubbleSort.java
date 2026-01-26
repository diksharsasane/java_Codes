public class Q2BubbleSort {
    private static int[] bubblSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] -arr[j];
                    arr[i] = arr[i]-arr[j];
                }
            }
        }
        return arr;
    }
    private static void printArry(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int queArr[] = {200,90,89,99,56,3,10,8};
        System.out.println("Before Sorting:");
        printArry(queArr);
        System.out.println("After Sorting:");
        printArry(bubblSort(queArr));
    }
}
