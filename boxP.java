package patterns;
import java.util.*;
class boxP{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of rows:");
        int r=sc.nextInt();
        System.out.println("enter columns:");
        int c=sc.nextInt();
        sc.close();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}