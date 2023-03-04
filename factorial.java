public class factorial {
    public static int fact(int n){
        
        if(n==0||n==1)
        {
            return 1;
        }
         
         int f=fact(n-1);
         int fac=n*f;
         return fac;
    }

    public static void main(String[] args) {
        int n=20;
        System.out.println(fact(n)); 
    }
}
