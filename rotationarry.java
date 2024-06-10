//package Array;

class rotationarry {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        /* for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        } */
        pri(arr);
        System.out.println();
       // int n=6;
        int d=2;
        rotary(arr,d);
        pri(arr);
    }

    public static void rotary(int arr[],int d){
        int temp[]=new int[arr.length];

        int k=0;

         for(int i=d;i<arr.length;i++){
            temp[k]=arr[i];
            k++;
         }
         for(int i=0;i<d;i++){
            temp[k]=arr[i];
            k++;
         }

         for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
         }
         
    }
    public static void pri(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
