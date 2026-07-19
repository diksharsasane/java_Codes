public class Q11_ReverseNumber {
    private static int reverse2(int n){
        int ans = 0;
        int rem = 0;
        int sign =0;
        if(n>0){
            sign = 1;
        }else{
            sign =-1;
            n=-n;
        }
        while(n != 0){
            rem = n%10;
            if((ans>Integer.MAX_VALUE)||(ans == Integer.MAX_VALUE && rem>7 )){
                return 0;
            }
            if((ans<Integer.MIN_VALUE)||(ans==Integer.MIN_VALUE && rem<-8)){
                return 0;
            }
            ans = (ans*10)+rem;
            n=n/10;
        }
        return ans*sign;
    }
    //for positive integer only
    private static int reverse1(int n){
        int val=0;
        while(n>0){
            val = (val*10)+ (n%10);
            n=n/10;
        }
        return val;
    }
    public static void main(String[] args) {
        System.out.println(reverse2(-12345));
        System.out.println(reverse1(-12345));
    }
}
