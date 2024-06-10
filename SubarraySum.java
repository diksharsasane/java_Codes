public class SubarraySum {

    public static void subMeth(int a[]) {
        int cursum=0;
        int maxSum=Integer.MIN_VALUE;


        for(int i=0;i<a.length;i++){
            int first=i;
            for(int j=i;j<a.length;j++){
                int last=j;
                cursum=0;
                for(int k=first;k<=last;k++){
                    // sum=sum+a[k];
                   cursum+=a[k];
                }
                System.out.println(cursum);
                if(maxSum<cursum){
                    maxSum=cursum;
                }
               // System.out.println();
                
            } 
        }
        System.out.println("Max sum:"+maxSum);
    }

    public static void main(String[] args) {
        int a[]={2,-4,6,-8,10};
        subMeth(a);
    }

}
