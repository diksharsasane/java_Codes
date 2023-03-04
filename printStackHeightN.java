public class printStackHeightN {

    public static int stckheight(int x,int n){
        if(x==0){
            return 0;
        }

        if(n==0){
            return 1;  
        }
        
        int xPownm1=stckheight(x, n-1);
        int xPown=x*xPownm1;
        return xPown;
    }
    public static void main(String[] args) {
        int x=2,n=4;
        System.out.println(stckheight(x, n));
    }
}
