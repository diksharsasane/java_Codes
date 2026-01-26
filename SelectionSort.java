public class SelectionSort {
    private static int[] selectionSort(int arr[]){
        int n= arr.length;
        int val=0;
        for(int k=0;k<n;k++){
            for(int i=k;i<n;i++){
                if(arr[val]>arr[i]){
                    val=i;
                }
            }
            int temp = arr[val];
            arr[val]=arr[k];
            arr[k] = temp;
        }
        return arr;
    }
    
    private static void printArray(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int queArr[] = {90,5,89,4,12,3,1,34};
        System.out.println("Before Sort:");
        printArray(queArr);
        System.out.println("After Sort:");
        printArray(selectionSort(queArr));
    }
}
