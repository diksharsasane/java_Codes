package patterns;
import java.util.*;
public class leftupTriangleP {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter rows:");
        int row=sc.nextInt();
        //System.out.println("enter columns:");
        //int colom=sc.nextInt();
        sc.close();
        for(int i=0;i<row;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
