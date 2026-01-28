public class Q4MergeSort {
    private static int[] merge(int arr[], int left, int mid, int right){
        int l = (mid-left)+1;
        int r = (right - mid);
        int arr1[] = new int[l];
        int arr2 []= new int[r];

        for(int i=0;i<l;i++){
            arr1[i] = arr[left+i];
        }
        for(int i=0;i<r;i++){
            arr2[i] = arr[mid+i+1];
        }

        int i=0,j=0,k=left;
        while(i<l && j<r){
            if(arr1[i]<=arr2[j]){
                arr[k++]=arr1[i++];
            }else if(arr1[i]>arr2[j]){
                arr[k++] = arr2[j++];
            }
        }
        while (i<l) {
            arr[k++]=arr1[i++];
        }
        while(j<r){
            arr[k++] = arr2[j++];
        }
        return arr;
    }
    private static void mergeSort(int arr[], int left,int right){
        if(left >= right){
            return;
        }
        int mid = left + (right - left)/2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);
        merge(arr, left, mid, right);

    }
    private static void printArry(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int queArr []= {90,4,89,7,2,78,57,12,1,0};
        System.out.println("Before Sorting:");
        printArry(queArr);
        System.out.println("After Soerting");
        mergeSort(queArr,0,queArr.length-1);
        printArry(queArr);
    }
}
