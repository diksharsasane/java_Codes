public class SubarraySum2 {
    public static void SubArry(int a[]) {
        int prefix[]=new int[a.length];
        int cursum=0;
        int maxsum=Integer.MIN_VALUE;

        //sum of elements from 0 index
        prefix[0]=a[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+a[i];
        }

        for(int i=0;i<a.length;i++){
            int start=i;
            for(int j=i;j<a.length;j++){
                int end=j;
                cursum=start==0 ? prefix[end]:prefix[end]-prefix[start-1];

                if(maxsum<cursum){
                    maxsum=cursum;
                }
            }
        }
        System.out.println(maxsum);
        
    }
    public static void main(String[] args) {
        int arr[]={10,-20,30,45,-67,-83,90};
        SubArry(arr);
    }
}
