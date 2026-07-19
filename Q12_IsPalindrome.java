public class Q12_IsPalindrome {
    private static boolean isPAlindrome(int num){
        int n=num;
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        int val=num;
        int no=0;
        for(int i=0;i<count;i++){
           no = (no*10)+(num%10);
           num=num/10;
        }
        if(no==val){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPAlindrome(-123454321));
    }
}
