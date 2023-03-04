public class printStackHeightLogN {

    public static int calheight(int x,int n){

        if(n==0){
            return 1;
        }
        if(x==0){  
            return 0;
        }

        if(n%2==0){ //even
            return calheight(x, n/2) *calheight(x, n/2);
        }
        else{ //odd
            return calheight(x, n/2) * calheight(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        int x=2, n=8;
        int tot=calheight(x, n);
        System.out.println(tot);
    }
}
//to decrease height we use ----->  
//EVEN ::> x power n/2 * x power n/2;
//ODD ::> x power n/2 * x power n/2 * x;  .... at same height
// alpha=height=(log n)to the base 2