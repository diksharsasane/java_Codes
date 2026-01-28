public class Q4_Q1InvertionCount {
    private static int invertionCount(int arr[]){
        return mergeSort(arr, 0, arr.length-1);
    }
    private static int mergeSort(int arr[], int left, int right){
        if(left>= right){
            return 0;
        }
        int count =0;
        int mid =left+ (right-left)/2;
        count+=mergeSort(arr, left, mid);
        count+= mergeSort(arr, mid+1, right);
        count+=merge(arr,left,mid,right);
        return count;
    }
    private static int merge(int arr[], int left, int mid, int right){
        int l = (mid-left)+1;
        int r = right-mid;
        int arr1[] = new int[l];
        int arr2[] = new int[r];
        int count=0;

        for(int i=0;i<l;i++){
            arr1[i] = arr[i+left];
        }
        for(int i=0;i<r;i++){
            arr2[i]= arr[i+mid+1];
        }

        int i=0,j=0,k=left;
        while(i<l && j<r){
            if(arr1[i]<arr2[j]){
                arr[k++]=arr1[i++];
            }else{
                arr[k++] = arr2[j++];
                count+=(l-i);
            }
        }
        while(i<l){
            arr[k++] = arr1[i++];
        }
        while(j<r){
            arr[k++] = arr2[j++];
        }
        return count;
    }
    public static void main(String[] args) {
        //I/P:[2, 4, 1, 3, 5]
        //o/p: 3 {(2,1),(4,1),(4,3)}

        int arr[] = {2,4,1,3,5};
        System.out.println("invertion count : "+invertionCount(arr));
    }
}
