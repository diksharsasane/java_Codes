public class LargestNo {
    
    public static void main(String[] args) {
        int arr[]={2,4,3,8,98,56,74,0,9,97,90};
        int larg=Integer.MIN_VALUE;
        int a;
        for(a =0;a<arr.length;a++){
            if(larg<arr[a]){
                larg=arr[a];
            }
            
        }
        System.out.println(larg);

    }
}
