package patterns;

import java.util.Scanner;

public class pyramidP {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows:");
        int row=sc.nextInt();
        sc.close();
        for(int i=0;i<row;i++){
            for(int j=i;j<row;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
