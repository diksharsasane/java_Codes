public class Q6_Q2ArragearryinSecondArraywise {
    private static int[] arrageArraywise(int arr1[],int arr2[]){
        int n= arr1.length;
        int max=arr1[0];
        int ans[]=new int[n];
        int k=0;
        for(int i=1;i<n;i++){
            if(arr1[i]>max){
                max= arr1[i];
            }
        }
        int freq[]= new int[max+1];
        for(int i=0;i<n;i++){
            freq[arr1[i]]++;
        }
        for(int i=0;i<arr2.length;i++){
            while(freq[arr2[i]]>0){
                ans[k]=arr2[i];
                freq[arr2[i]]--;
                k++;
            }
        }
        for(int i=0;i<=max;i++){
            while(freq[i]>0){
                ans[k]=i;
                freq[i]--;
                k++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr1[]={2,3,5,2,6,3,2,5};
        int arr2[]={3,2,6};

        int ans[]=arrageArraywise(arr1, arr2);
        System.out.println("After :");
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
