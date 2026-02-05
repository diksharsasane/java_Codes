public class Q4_Q2CountSmallAfterSelf {
    static int result[];
    static int index[];
    private static void smallCountAfter(int arr[]){
        
        int n= arr.length;
        result =new int[n];
        index=new int[n];
        for(int i=0;i<n;i++){
            index[i]= i;
        }
        mergeSort(arr, 0, arr.length-1);
        /* for(int i=0;i<n;i++){
            result[i]=arr[index[i]];
        }*/
    }
    private static void mergeSort(int arr[], int left,int right){
        if(left>=right) return;
        int mid = left+(right-left)/2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);
        merge(arr, left, mid, right);
    }
    private static void merge(int arr[], int left, int mid, int right){
        int l=left, r=mid+1, k=0;
        int temp[] = new int[right-left+1];
        while(l<=mid && r<=right){
            if(arr[index[l]]>arr[index[r]]){
                result[index[l]] += (right-r+1);                
                temp[k++] = index[l++];
            }else{
                temp[k++] = index[r++];
            }
        }
        while(l<=mid){
            temp[k++]=index[l++];
        }
        while(r<=right){
            temp[k++] = index[r++];
        }
        for(int i= 0; i<temp.length;i++){
            index[left+i] = temp[i];
        }
    }
    public static void main(String[] args) {
        int arr[] ={2,4,1,3,5};
        System.out.println("Count small element after self");
        smallCountAfter(arr);
        for(int i: result){
            System.out.print(i+" ");
        }
    }
}
