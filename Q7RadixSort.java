public class Q7RadixSort {
    //basically used for large datesets because no comparison
    //sorting each decimal position wise from unit place->tens place->hundreads place so on
    //
    private static void print(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    private static int maxval(int arr[]){
        int max= arr[0];
        for(int i:arr){
            if(max<i){
                max = i;
            }
        }
        return max;
    }

    private static void radixSort(int arr[]){
        int count[] = new int[10];
        int max = maxval(arr);
        int radixArray[][]=new int[10][arr.length];
        int rdx = 1;
        while(max/rdx > 0){
            for(int val: arr){
                int ans = (val/rdx)%10;
                radixArray[ans][count[ans]] = val;
                count[ans]++;
            }

            int loc = 0;
            for(int i=0;i<10;i++){
                for(int j=0;j<count[i];j++){
                    arr[loc++]=radixArray[i][j];
                }
                count[i]=0;
            }
            rdx *=10;
        }
    }
    public static void main(String[] args) {
        int arr[] = {170, 45, 75, 90, 802, 24, 2, 66};
        System.out.println("Before Sort:");
        print(arr);
        System.out.println("\nAfter Sort");
        radixSort(arr);
        print(arr);
    }
}
