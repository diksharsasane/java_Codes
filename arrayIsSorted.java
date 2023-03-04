public class arrayIsSorted {

    public static boolean isSorted(int arr[],int idx){
       /* if(idx==arr.length-1){
            return true;
        }

        if(arr[idx]<arr[idx+1]){
         
         return isSorted(arr, idx+1);
        }
        else{
            return false;
        }*/

        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]>arr[idx+1]){
            return false;

        }
        return isSorted(arr, idx+1);
    }

    public static void main(String[] args) {
       int arr[]={1,2,3,4,5,6,7};
      System.out.println(isSorted(arr, 0));
    }
}
