package patterns;

import java.util.Scanner;

public class holeTriangleP {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter rows:");
        int row=sc.nextInt();
        sc.close();
        for(int i=1;i<=row;i++){
            for(int j=0;j<i;j++){
                if(i!=row){
                    if((j==0)||(j==(i-1))){
                        System.out.print("*");
                    }
                    else{
                            System.out.print(" ");
                    }
                }
                else{
                    System.out.print("*");
                }
            }
        
                System.out.println();
            }
            
    }
    }