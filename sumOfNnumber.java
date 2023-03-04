public class sumOfNnumber {
    
   /* public static void sumNo(int sum,int n)
    {
        if(n==0)
        {
            System.out.println(sum);
            return ;
        }

        sum=sum+n;
        sumNo(sum, n-1);  
    }*/

    public static void sumNo(int i,int n,int sum){

        if(i==n)
        {
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        sumNo(i+1, n, sum);
    }
    public static void main(String[] args) {
      /*  int sum=0;
        int n=5;
       sumNo(sum, n);
       */

       int sum=0;
       int i=1;
       int n=5;
       sumNo(i, n, sum);
    }
}
