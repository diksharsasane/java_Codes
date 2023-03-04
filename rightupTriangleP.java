package patterns;
import java.util.*;
public class rightupTriangleP {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter rows:");
        int row=sc.nextInt();
        sc.close();
        for(int i=0;i<row;i++){
            for(int j=i;j<(row-1);j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
