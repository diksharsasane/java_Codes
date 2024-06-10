public class SubarraySum3kadaneAlgo {
    public static void kadanes(int a[]){
        int ms=Integer.MIN_VALUE;
        int cr=0;
        for(int i=0;i<a.length;i++){
            cr=cr+a[i];
            if(cr<0){
                cr=0;
            }
            ms=Math.max(cr, ms);
        }
        System.out.println(ms);
    }
    public static void main(String[] args) {
        int num[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(num);
    }
}
