package patterns;

import java.util.Scanner;

public class hollwpyramidP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("rows:");
        int row=sc.nextInt();
        sc.close();
        for(int i=0;i<row;i++){
            for(int j=i;j<row;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
               if((i==0)||(i==row-1)){
                System.out.print("*");
               }
               else{
                if(k==0||k==2*i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
               }
            }
            System.out.println();
        }


    }
}
