package patterns;

import java.util.Scanner;

public class lowerpyramidP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows:");
        int row=sc.nextInt();
        sc.close();
        for(int i=0;i<row;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*(row-i)-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
