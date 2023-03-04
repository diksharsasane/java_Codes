package patterns;

import java.util.Scanner;

public class leftBottomTriangleP {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter rows:");
        int row=sc.nextInt();
        sc.close();
        for(int i=0;i<row;i++){
            for(int j=row;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
