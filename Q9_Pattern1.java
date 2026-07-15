public class Q9_Pattern1{

    public void pattern22(int n) {
        int size =(n*2)-1;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
               int top = i;
               int left = j;
               int bottom = size-i-1;
               int right = size-j-1;
               
               int val = Math.min(Math.min(top,bottom),Math.min(left,right));

               System.out.print((n-val)+" ");
            }
            System.out.println();
        }
    }

    public void pattern21(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==(n-1) || j==(n-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void pattern20(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<((n-i-1)*2);j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int j=0;j<((n-i)*2);j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern19(int n) {
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int j=0;j<(n-i)*2;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<(n-i-1)*2;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern18(int n) {
        for(int i=n;i>0;i--){
            for(int j=i-1;j<n;j++){
                System.out.print((char) (65+j)+" ");
            }
            System.out.println();
        }
    }
    
    public static void pattern17(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i)-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print((char) (65+j));
            }
            for(int j=i;j>0;j--){
                System.out.print((char) (65+j-1));
            }
            System.out.println();
        }
    }

    public static void pattern16(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char) (65+i));
            }
            System.out.println();
        }
    }

    public static void pattern15(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i);j++){
                System.out.print((char) (65+j));
            }
            System.out.println();
        }
    }

    public static void pattern14(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char) (64+j));
            }
            System.out.println();
        }
    }

    public static void pattern13(int n) {
        int val=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(val++ +" ");
            }
            System.out.println();
        }
    }

    public static void pattern12(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=0;j<(2*(n-i));j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern11(int n) {
        for(int i =0;i<n;i++){
            for(int j=0;j<=i;j++){
                if((i+j)%2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern10(int n) {
        for(int i=0; i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern9(int n) {
        for(int row=0;row<n;row++){
            for(int i=0;i<n-row-1;i++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*row)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row=0;row<n;row++){
            for(int i=0;i<row+1;i++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*(n-row))-2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n) {
        for(int row=0;row<n;row++){
            for(int i=0; i<row;i++){
                System.out.print(" ");
            }
            for(int j=0;j<2*(n-row)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {
        for(int row = 0;row <n;row++){
            for(int i=0;i<n-row-1;i++){
            System.out.print(" ");
            }
            for(int j = 0; j<(2*row)+1;j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    public static void pattern6(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n+1)-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //pattern15(5);
        pattern16(6);
    }
}