public class Q1InsertionSort {
    private static int[] insrtSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int val = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>val){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=val;
        }
        return arr;
    }
    private static void printArry(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int queArr[] = {10,8,4,9,23,5,90};
        System.out.println("Before Sorting");
        printArry(queArr);
        System.out.println("After Sorting");
        printArry(insrtSort(queArr));
    }
}
